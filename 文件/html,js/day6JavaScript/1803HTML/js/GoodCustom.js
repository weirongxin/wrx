//商品编号  名称  单价  库存数量  图片  产地
function Good(id,name,price,count,pic,loc){
	var _this = this;
	_this.id = 0;
	_this.name = "";
	_this.price = 0.0;
	_this.count = 0;
	_this.pic = "";
	_this.loc = "";
	
	var init = function(){
		_this.id = id;
		_this.name = name;
		_this.price = price;
		_this.count = count;
		_this.pic = pic;
		_this.loc = loc;
	}
	init();
}
//序号 商品名称  单价  数量  图片   总价(单价*数量)
function GoodCar(id,name,price,count,pic){
	var _this = this;
	_this.name = "";
	_this.price = 0.0;
	_this.count = 0;
	_this.pic = "";
	
	var init = function(){
		_this.name = name;
		_this.price = price;
		_this.count = count;
		_this.pic = pic;
	}
	init();
}