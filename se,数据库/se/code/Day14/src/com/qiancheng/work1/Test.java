package com.qiancheng.work1;

public class Test {

	public static void main(String[] args) {
		User user = User.getInstance();
		user.setName("С��");
		user.setAge(18);
		user.speak();
		
		LazyUser user2 = LazyUser.getInstance();
		user2.setName("С��");
		user2.setAge(19);
		user2.speak();

	}

}
