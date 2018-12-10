package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import entity.User;

public class UserController {
	UserDao dao = new UserDaoImpl();
	public User queryUser(String name){
		User user = null;
		user = dao.queryUserByName(name);
		return user;
	}
}
