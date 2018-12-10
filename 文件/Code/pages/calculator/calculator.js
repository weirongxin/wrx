// pages/calculator/calculator.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id_add:'+',
    id_reduce:'-',
    id_mul:'*',
    id_division:'/',
    id_mod: '%',
    id_num0:'0',
    id_num1:'1',
    id_num2:'2',
    id_num3:'3',
    id_num4:'4',
    id_num5:'5',
    id_num6:'6',
    id_num7:'7',
    id_num8:'8',
    id_num9:'9',
    id_num00: '.',
    showValue:'1234567',//屏幕显示信息
    clickFunc:false,//存储是否点击+ - * / %
    operator:''//记录功能按钮的值 + - * / %
  },
  //退格
  back:function(){
    if (this.data.showValue=='0'){
        return;
    } else if (this.data.showValue.length==1){
      this.setData({
           showValue:'0'
        });
    }else{
      //获取需要清除的最后一个元素，如果是+ - * / %其中一个，则将已经录入的状态置回false
      var startIndex = this.data.showValue.length-1;
      var endIndex = this.data.showValue.length;
      var delChar = this.data.showValue.substring(startIndex, endIndex);
      if(delChar=='+'||delChar=='-'||delChar=='*'||delChar=='/'||delChar=='%'){
        this.setData({
          clickFunc: false
        });
      }
      //将最后一个元素清除
      this.setData({
        showValue: this.data.showValue.substring(0, this.data.showValue.length-1)
       });
   }
  },//清空 
  clear:function(){
    this.setData({
      showValue:'0',
      clickFunc: false
    });
  },//功能按钮 
  funcClick:function(event){
    //event 按钮的点击事件对象，从事件中获取target 被点击的目标控件对象
    //从控件对象中获取id属性值
    //(event为点击事件  target为按钮  id为按钮的id属性值)
    var idData = event.target.id;
    console.log(idData);
    //是否已经录入一次功能符号
    if (this.data.clickFunc){
        return;
    }else{
      //已经点击了计算按钮
      this.setData({
        clickFunc:true
      });
      //判断触发功能按钮
      this.setData({
        operator:idData,
        showValue:this.data.showValue+idData
      });
    }
  },//数字按钮 
  numclick:function(event){
    var idData = event.target.id;
    console.log(idData);
    //判断当前是否为初始值'0'
    if (this.data.showValue=='0'){
      this.setData({
        showValue:idData
      });
    }else{
      this.setData({
        showValue: this.data.showValue + idData
      });
    }
  },//等于号 按钮
  result:function(){
    console.log("等于");
    //计算结果前判断是否已经点击+ - * / %
    if (!this.data.clickFunc){
      return;
    }
    //判断是否最后一个字符为 + - * / %
    var startIndex = this.data.showValue.length - 1;
    var endIndex = this.data.showValue.length;
    var lastChar = this.data.showValue.substring(startIndex, endIndex);
    if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '%') {
      return;
    }
    //可以进行计算  将显示的字符串 以功能字符进行拆分
    var nums = this.data.showValue.split(this.data.operator);
    //将参与计算的数据转换为数值类型
    var num1 = new Number(nums[0]);
    var num2 = new Number(nums[1]);
    //根据运算 计算数据
    var result = 0;
    if (this.data.operator == '+') {
      result = num1+num2;
    } else if (this.data.operator == '-') {
      result = num1 - num2;
    } else if (this.data.operator == '*') {
      result = num1 * num2;
    } else if (this.data.operator == '/') {
      result = num1 / num2;
    } else if (this.data.operator == '%') {
      result = num1 % num2;
    }
    //在屏幕显示结果
    this.setData({
      showValue : result,
      clickFunc : false
    });

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