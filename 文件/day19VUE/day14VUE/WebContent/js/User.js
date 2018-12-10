function User(name,age,gender){
	var _this = this;
	_this.name="";
	_this.age=0;
	_this.gender="";
	
	var init = function(){
		_this.name = name;
		_this.age = age;
		_this.gender = gender;
	}
	init();
}
