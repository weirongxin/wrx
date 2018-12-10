package dao;

import java.util.List;

import entity.User;

public interface UserDao {
	public List<User> queryUser();
	public User queryUserByName(String name);
	public void insertUser(User u);
}
