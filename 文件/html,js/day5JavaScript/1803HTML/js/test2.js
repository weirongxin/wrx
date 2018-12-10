function Student(name,gender,age){
	//_this：变量名  this：指代当前对象
	var _this = this;
	//创建 私有属性 赋初始值
	_this.name = "";
	_this.gender = "";
	_this.age = 18;

	//模拟构造方法 ，将三个参数赋值给三个私有属性
	var init = function() {
		_this.name = name;
		_this.age = age;
		_this.gender = gender;
	}
	//调用构造方法
	init();
	//添加功能性方法
	_this.say = function() {
	document.write(_this.name);
	document.write(_this.gender);
	document.write(_this.age);
	}
}