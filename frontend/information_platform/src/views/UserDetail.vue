<template>
    <div>
      <tophead></tophead>
      <!--<h1>{{userdate.userid}}</h1>-->
      <div class="center">
        <font size="4">用户id： {{userdate.userid}}</font>
        <br>
        <font size="4">昵称： {{userdate.usernickname}}</font>
        <br>
        <font size="4">用户积分： {{userdate.userpoint}}</font>
        <br>
        <!--<Input class="input" v-model="value1" size="large" :placeholder="user.nickname" />-->
        <!--<Input class="input" v-model="value2" size="large" :placeholder="user.userpwd" />-->
        <!--<Button type="primary" size="large">确认</Button>-->
        <Button type="primary" size="large" @click="addfriend">添加好友</Button>
        &nbsp;&nbsp;
        <Button type="primary" size="large" @click="addblacklist">加入黑名单</Button>
      </div>
      <br>
      <bottom></bottom>
    </div>
</template>
<style scoped>
  .center{
    width: 20%;
    margin: auto;
  }
</style>
<script>
  import tophead from '@/components/Head'
  import bottom from '@/components/Bottom'
  import axios from 'axios'

    export default {
      data() {
          return {
            userdate: {
              userid: '',
              usernickname: '',
              userpoint: ''
            },
            status1: '',
            errormsg1: '',
            status2: '',
            errormsg2: '',
            status3: '',
            errormsg3: '',
          }
      },
      components: {
        tophead,
        bottom
      },
      created(){
          this.getParams();
      },
      methods:{
        getParams(){
          this.userdate.userid = this.$route.query.id;
          axios.get("/user/getuserinfo", {
            token: this.$store.state.token,
            userid: this.$store.state.userId,
            searchuserid: this.userdate.userid,
          }).then((response) => {
            let res = response.data;
            if(res.status === "success") {
              this.userdate.usernickname = res.userdate.usernickname;
              this.userdate.userpoint = res.userdate.userpoint;
              this.status1 = res.status;
            } else {
              this.status1 = res.status;
              this.errormsg1 = res.message;
            }
          })
        },
        addfriend(){
          if(this.$store.state.token) {
            axios.post("/user/addfriend", {
              token: this.$store.state.token,
              userid: this.$store.state.userId,
              friendid: this.userdate.userid,
            }).then((response) => {
              let res = response.data;
              if (res.status === "success") {
                this.status2 = res.status;
                this.$Message.info('添加好友成功！');
              } else {
                this.status2 = res.status;
                this.errormsg2 = res.message;
                this.$Message.info('添加好友失败： ' + this.errormsg2);
              }
            })
          } else{
            this.$router.push({path:'/Login'});
            this.$Message.info('请先登录！');
          }
        },
        addblacklist(){
          if(this.$store.state.token) {
            axios.post("/user/addblacklist", {
              token: this.$store.state.token,
              userid: this.$store.state.userId,
              blacklistid: this.userdate.userid,
            }).then((response) => {
              let res = response.data;
              if(res.status === "success") {
                this.status3 = res.status;
                this.$Message.info('拉黑对方成功！');
              } else {
                this.status3 = res.status;
                this.errormsg3 = res.message;
                this.$Message.info('拉黑对方失败： ' + this.errormsg2);
              }
            })
          } else{
            this.$router.push({path:'/Login'});
            this.$Message.info('请先登录！');
          }
        }
      },
      watch: {
        '$route': 'getParams'
      }
    }
</script>
