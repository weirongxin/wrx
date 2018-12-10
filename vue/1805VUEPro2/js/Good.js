function Good(id,name,count,price){
	var _this = this;
	_this.id="";
	_this.name="";
	_this.count=0;
	_this.price=0.0;
	_this.sumPrice=0.0;
	
	var init=function(){
		_this.id=id;
		_this.name=name;
		_this.count=count;
		_this.price=price;
		_this.sumPrice=_this.count*_this.price;
	}
	init();
}
