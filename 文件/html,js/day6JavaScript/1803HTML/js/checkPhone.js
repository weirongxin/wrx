function check(telNumber){
	//2.取标签中的数据
	var telData = telNumber;
	//3.定义一个正则表达式的规则 
	var reg = /^[1]\d{10}$/;
	//4.通过规则对象reg验证 标签中的数据
	var result = reg.test(telData);
	return result;
}
//验证邮箱
function checkMail(mail){
	var mailData = mail;
	var reg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	return reg.test(mailData);
}
