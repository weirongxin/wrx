package dao;

import entity.User;
public interface UserDao {
	//根据用户名查询用户信息
	public abstract User queryUserByName(String name);
}
