function Good(name,price,loc){
	var _this = this;
	_this.name = "";
	_this.price = 0.0;
	_this.loc = "";
	
	var init = function(){
		_this.name = name;
		_this.price = price;
		_this.loc = loc;
	}
	init();
}
