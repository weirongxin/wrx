package com.qiancheng.work2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("1", "a"));
		users.add(new User("2", "b"));
		users.add(new User("3", "c"));
		users.add(new User("4", "d"));
		users.add(new User("5", "e"));
		
		Test t = new Test();
		boolean status =  t.checkUser(new User("3","c"),users);
		System.out.println(status);
	}
	//判断参数用户是否存在
	public boolean checkUser(User user,ArrayList<User> users){
		boolean status = false;
		//contains方法  集合将元素逐一和参数作比较
		status = users.contains(user);
		System.out.println("包含方法："+status);
		//迭代器 逐一比较元素和参数
		for(User tempUser:users){
			if(tempUser.equals(user)){
				status = true;
				break;
			}
		}
		return status;
	}

}
