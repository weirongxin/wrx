//logs.js
const util = require('../../utils/util.js')

Page({
  data: {
    logs: []
  },
  onLoad: function () {
    this.setData({
      logs: (wx.getStorageSync('logs') || []).map(log => {
        return util.formatTime(new Date(log))
      })
    })
  },
  //当前页面的生命周期方法 ready加载、show显示、hide隐藏/后台
  onShow:function(){
    console.log("日志页面 的onshow显示");
  },onReady:function(){
    console.log("日志页面 的onReady加载");
  },onHide:function(){
    console.log("日志页面 onHide 隐藏");
  }
})
