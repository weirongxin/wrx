package service;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

public class UserManager {
	UserDao userDao = new UserDaoImpl();
	//登录
	public User login(String name,String pass){
		User u = userDao.queryUserByName(name);
		return u;
	}
	//注册
	public boolean register(String name,String pass){
		boolean status = true;
		User u = userDao.queryUserByName(name);
		if(u!=null){
			status = false;
		}
		userDao.insertUser(u);
		return status;
	}
}
