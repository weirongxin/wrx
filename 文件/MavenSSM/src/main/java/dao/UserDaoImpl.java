package dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import mapper.UserMapper;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public String queryNameById(int id) {
		SqlSession s = this.getSqlSession();
		UserMapper mapper = s.getMapper(UserMapper.class);
		return mapper.queryNameById(id);
	}

}
