<template>
  <div>
    <tophead/>
    <div v-if="aDate.length != 0">
      <Row>
        <Col span="16" offset="4">
          <Tabs :animated="false" style="text-align: left">
            <TabPane label="总览">
              <div style="min-height: 700px">
                <Divider orientation="left"class="title" v-if="a1.length != 0"><b>系统通知</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="(a,index) in a1" v-if="index < 3">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
                <b class="more" v-if="a1.length != 0">......</b>
                <Divider orientation="left" class="title" v-if="a2.length != 0"><b>假日调休</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="(a,index) in a2" v-if="index < 3">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
                <b class="more" v-if="a2.length != 0">......</b>
                <Divider orientation="left" class="title" v-if="a3.length != 0"><b>失物启示</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="(a,index) in a3" v-if="index < 3">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
                <b class="more" v-if="a3.length != 0">......</b>
              </div>
            </TabPane>
            <TabPane label="系统通知">
              <div style="min-height: 700px">
                <Divider orientation="left" class="title"><b>系统通知</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="a in a1">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
              </div>
            </TabPane>
            <TabPane label="假日调休">
              <div style="min-height: 700px">
                <Divider orientation="left" class="title"><b>假日调休</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="a in a2">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
              </div>
            </TabPane>
            <TabPane label="失物启示">
              <div style="min-height: 700px">
                <Divider orientation="left" class="title"><b>失物启示</b></Divider>
                <Collapse value="0" style="background: white;width: 80%;margin:0 auto" >
                  <Panel v-for="a in a3">
                    <span >{{a.title}}</span><div style="display:inline;float: right;margin-right: 10%">{{a.date}}</div>
                    <p slot="content" style="text-align: justify;text-indent:25px">{{a.content}}</p>
                  </Panel>
                </Collapse>
              </div>
            </TabPane>
          </Tabs>
        </Col>
      </Row>
     </div>
     <div style="min-height: 700px" v-else>
       <img id="pic" src="./../assets/sorry.png"/>
       <p style="font-size: 3em;margin-top: -70px;font-family: STHupo">今天没有公告哦</p>
     </div>
    <bottom/>
  </div>
</template>

<script>
  import tophead from '@/components/Head.vue'
  import bottom from '@/components/Bottom.vue'
  import axios from 'axios'
  export default {
    name: "AnnouncementDate",
    data(){
      return{
        msg:[
        ],
        a1:[],
        a2:[],
        a3:[],
        aDate:[],
        status1: '',
        errormsg1: '',
      }
    },
    methods: {
      getdata(date){
        console.log(date);
        axios.get("/announcement").then((response) => {
          let res = response.data;
          if(res.status === "success") {
            this.msg = res.announcement;
            var i = 0,j=0;
            for(i = 0; i < this.msg.length; i++){
              if(this.msg[i].date === date){
                this.aDate.splice(j++, 1, this.msg[i]);
              }
            }
            console.log(this.aDate)
            this.classify();
          } else {
            this.status1 = res.status;
            this.errormsg1 = res.message;
            this.$Message.info('获取失败： ' + this.errormsg1);
          }
        })
        // var i = 0,j=0;
        // for(i = 0; i < this.msg.length; i++){
        //   if(this.msg[i].date == date){
        //     this.aDate.splice(j++, 1, this.msg[i]);
        //   }
        // }
      },
      classify() {
        let i = 0, j = 0, k = 0, index;
        for (index = 0; index < this.aDate.length; index++) {
          // if (this.msg[index].type === '系统通知') {
          //     this.a1.splice(i++, 1, this.msg[index])
          // }
          switch (this.aDate[index].type){
            case '系统通知':
              this.a1.splice(i++, 1, this.aDate[index]);
              break;
            case '调休通知':
              this.a2.splice(j++, 1, this.aDate[index]);
              break;
            case '失物启示':
              this.a3.splice(k++, 1, this.aDate[index]);
              break;
          }
        }
      }
    },
    components: {
      tophead,
      bottom
    },
    mounted () {
      this.getdata(this.$router.currentRoute.params.id)
      // this.classify();
      // console.log(this.aDate);
      // console.log(this.a1);
    }
  }

</script>

<style scoped>
  .title{
    font-size: 2.5em;
    margin-top: 20px;
  }
  .more{
    font-size: 2em;
    margin-left: 10%;
  }
</style>
