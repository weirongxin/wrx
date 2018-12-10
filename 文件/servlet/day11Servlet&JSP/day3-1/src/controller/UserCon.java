package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

public class UserCon {
	UserDao userDao = new UserDaoImpl();
	
	public User queryUserByName(String name){
		User user = null;
		user = userDao.querUserByName(name);
		return user;
	}
	//新增用户（先判断用户是否存在，不存在则创建）
	public boolean addUser(User user){
		//1.用户是否存在的状态
		boolean exit = false;
		//2.根据取用户
		User getUser = queryUserByName(user.getUserName());
		//3.如果获取到 则该用户名已经存在了
		if(getUser!=null){
			exit = true;
		}else{
			userDao.insertUser(user);
		}
		return exit;
	}
}
