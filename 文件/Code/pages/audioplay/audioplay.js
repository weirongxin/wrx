//创建音频对象(由微信提供音频对象)
const myAudio = wx.createInnerAudioContext();
//设置音频对象需要播放的音频数据源
// myAudio.src = 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
//http://www.170mv.com/kw/other.web.ri01.sycdn.kuwo.cn/resource/n3/15/77/4214239130.mp3
 myAudio.src = 'http://ovhvevt35.bkt.clouddn.com/photo/%E5%A5%BD%E5%A6%B9%E5%A6%B9%E4%B9%90%E9%98%9F%20-%20%E4%B8%8D%E8%AF%B4%E5%86%8D%E8%A7%81.mp3'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    //添加两个元素数据 
    //当前播放时长
    currentTime:0,
    //音乐的总时长
    duration:0,
    //当前歌曲的时间进度
    nowTime:"00:00",
    //歌曲的总时长
    totalTime:"10:00"
  },
  play:function(){
    var that = this;
    //播放对象调用播放方法
    myAudio.play();
    //播放器开始执行时调用的回调方法
    myAudio.onPlay(()=>{
      //更新播放时间
      that.updateTime(that);
    });
  },updateTime:function(that){
    //回调事件  播放器进度发生变更时会自动调用
    myAudio.onTimeUpdate(()=>{
      //获取当前播放进度（不要小数点后的数字）
      var cutime = myAudio.currentTime.toFixed(0);
      //获取总时长(不要小数点后的数字)
      var total = myAudio.duration.toFixed(0);
      //设置存储绑定到slider上的数据
      that.setData({
        currentTime :cutime,
        duration :total,
        nowTime:that.changeTime(cutime),
        totalTime:that.changeTime(total)
      });
    });
  },
  /*显示当前 时间进度和总时间 */
  changeTime:function(time){
    var timeValue1 = (time/60).toFixed(0);
    var timeValue2 = (time % 60).toFixed(0);
    var showTime="";
    if (timeValue1<10){
      showTime = showTime + "0"
    }
    showTime = showTime + timeValue1 + ":";
    if (timeValue2<10){
      showTime = showTime + "0"
    }
    showTime = showTime + timeValue2;
    return showTime;
  },
  stop:function(){
    myAudio.stop();

  },pause:function(){
    myAudio.pause();
  },
  /*进度条手动调节后出发的事件，同步调整歌曲的进度 */
  sliderChange:function(event){
    //滑块当前的位置数据
    var changeValue = event.detail.value;
    //调节歌曲进度
    myAudio.seek(changeValue);
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})