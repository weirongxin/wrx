function User(name,gender,age){
	var _this = this;
	_this.name = "xiaoming";
	_this.gender = "F";
	_this.age = 18;
	
	var init = function(){
		_this.name = name;
		_this.gender = gender;
		_this.age = age;
	}
	init();
}
