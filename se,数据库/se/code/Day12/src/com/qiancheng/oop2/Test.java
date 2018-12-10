package com.qiancheng.oop2;

public class Test {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("小花");
		
		Monkey m = new Monkey();
		m.setName("小孙");
		
		Bear b = new Bear();
		b.setName("大黑");
		
		SeaLion s = new SeaLion();
		s.setName("小琪");

		Test t = new Test();
		//调用方法 method参数为动物类型
		t.method(b);
	}
	//封装方法  使用动物做自我介绍
	public void method(Animal an){
		//1.an本质为传递过来的参数对象，实质已经是Animal类型的引用
		an.say();
		//2.通过 an不能直接访问子类中的独有方法，因为Animal中不存在该方法
		//an.eatBone();
		//将参数的an  通过引用类型的向下转型(强制类转换)
		//instanceof关键字   用法： A  instanceof B  
		//返回值为boolean类型  判断A是否为B类的对象或子类对象
		if(an instanceof Dog){
			Dog dog = (Dog)an; 
			//Dog类中存在的方法 dog对象可以直接调用
			dog.eatBone();
		}else if(an instanceof Monkey){
			Monkey mon = (Monkey)an;
			mon.rideBike();
		}else if(an instanceof Bear){
			Bear b = (Bear)an;
			b.jumpFire();
		}
		
	}

}
