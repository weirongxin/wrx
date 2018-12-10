function Good(name,price,loc,brand){
	var _this = this;
	_this.name = "";
	_this.price = 0.0;
	_this.loc = "";
	_this.brand = "";
	
	var init = function(){
		_this.name = name;
		_this.price = price;
		_this.loc = loc;
		_this.brand = brand;
	}
	init();
	
	_this.say = function(){
//		alert(11);
		return _this.name+_this.price+_this.loc+_this.brand;
	}
}
