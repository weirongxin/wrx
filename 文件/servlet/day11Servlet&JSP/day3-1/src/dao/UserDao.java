package dao;

import entity.User;

public interface UserDao {
	public abstract User querUserByName(String name);
	public abstract void insertUser(User user);
}	
