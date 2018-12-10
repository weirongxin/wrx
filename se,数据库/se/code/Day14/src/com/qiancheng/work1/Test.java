package com.qiancheng.work1;

public class Test {

	public static void main(String[] args) {
		User user = User.getInstance();
		user.setName("Ð¡Ã÷");
		user.setAge(18);
		user.speak();
		
		LazyUser user2 = LazyUser.getInstance();
		user2.setName("Ð¡ºì");
		user2.setAge(19);
		user2.speak();

	}

}
