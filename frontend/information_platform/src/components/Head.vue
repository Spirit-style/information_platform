<template>
  <div class="head-content">
    <div id="word">
      <img id="pic" src="./../assets/logo.jpg" height="17%" width="17%"/>
      <img src="./../assets/headline.png" height="40%" width="40%"/>
      <div id="loginbtn">
        <!--<Button type="primary" shape="circle" @click="jumpLogin">登录</Button>-->
        <!--<Button type="primary" shape="circle" to="/Manage/User">管理</Button>-->
        <!--<font size="4" v-text="$store.state.userId" color="white" @click=""></font>-->
        <!--<font size="4" v-text="$store.state.token" color="white" @click=""></font>-->
        <Icon type="md-settings" size="25" v-if="$store.state.token" @click="jumpToChangeUserDetail"/>
        <font size="4" v-if="$store.state.token" v-text="$store.state.userNickname" color="white" @click=""></font>
        &nbsp;&nbsp;
        <Button type="primary" shape="circle" v-if="managetype && $store.state.token" to="/Manage/User">管理</Button>
        <Button type="primary" shape="circle" @click="jumpLogin" v-if="!$store.state.token">登录</Button>
        <Button type="primary" shape="circle" @click="jumpLogout" v-if="$store.state.token">退出</Button>
      </div>
    </div>
    <div id="navigation">
      <Menu id="menu" mode="horizontal" :theme="theme1" active-name="1" @on-select="routerTo">
        <MenuItem id="homepage" name="/HomePage">
          <Icon type="ios-home" />
          首页
        </MenuItem>
        <MenuItem id="announcement" name="/Announcement">
          <Icon type="md-open" />
          公告
        </MenuItem>
        <!--<MenuItem id="announcement1" to="/announcement1">-->
          <!--<Icon type="ios-list-box" />-->
          <!--校园事务-->
        <!--</MenuItem>-->
        <MenuItem id="announcement2" name="/LostAFound/Board">
          <Icon type="ios-list-box"/>
          失物招领
        </MenuItem>
        <MenuItem id="help" name="/Help">
          <Icon type="ios-hand" />
          互助系统
        </MenuItem>
        <MenuItem id="forum" name="/Forum">
          <Icon type="ios-text" />
          论坛
        </MenuItem>
        <!--<MenuItem id="info1" to="/info1">-->
          <!--<Icon type="ios-people" />-->
          <!--群组消息-->
        <!--</MenuItem>-->
        <MenuItem id="info2" name="/Message" >
          <Icon type="ios-mail" />
          私信
        </MenuItem>
        <MenuItem id="appeal" name="/Appeal">
          <Icon type="md-help" />
          申诉
        </MenuItem>
        <MenuItem id="find" name="/Find">
          <Icon type="ios-search" />
          搜索好友
        </MenuItem>
      </Menu>
    </div>
  </div>
</template>
<script>
  import './../assets/headline.png'
  import './../assets/logo.jpg'
  import axios from 'axios'
  import store from './../../store/store'
  export default {
    data () {
      return {
        theme1: 'light',
        managetype:false,
      }
    },
    methods: {
      jumpLogin(){
        this.$router.push({path: '/Login'});
      },
      jumpLogout(){
        this.$store.commit('isLogout');
        this.$router.push({path: '/HomePage'});
      },
      routerTo(name){
        this.$router.push(name)
      },
      jumpToChangeUserDetail(){
        this.$router.push({path: '/ChangeUserDetail'})
      },
      ifmanage(){
        axios.post("/ifmanage", {
          token: this.$store.state.token,
          userid: this.$store.state.userId,
        }).then((response) => {
          let res = response.data;
          console.log(response)
          if(res.status === "success") {
            this.managetype=res.ifmanage;
          } else {
            this.status1 = res.status;
            this.errormsg1 = res.message;
            this.$Message.info('失败：' + this.errormsg1);
          }
        })
      }
    },
    created(){
      this.ifmanage();
    }
  }
</script>
<style scoped>
  #loginbtn{
    position: absolute;
    right: 2%;
  }
  .head-content{
    position: relative;
    top: -50px;
    width: 100%;
  }
  #word{
    display: flex;
    align-items: center;
    justify-content: center;
    background: #245086;
  }
  #navigation{
    height: 25%;
    display: flex;
    align-items: center;
    justify-content: center;
  }

</style>
