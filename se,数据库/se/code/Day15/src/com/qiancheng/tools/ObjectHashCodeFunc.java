package com.qiancheng.tools;

public class ObjectHashCodeFunc {

	//当前方法为对父类 方法的重写
	//如果不返回 super的哈希算法，则当前类的所有对象哈希值获取的为同一个值
	@Override
	public int hashCode() {
		String name = "xiaoming";
		return name.hashCode();//super.hashCode();
	}
	
}
