package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public String queryNameById(int id){
		return userDao.queryNameById(id);
	}
}
