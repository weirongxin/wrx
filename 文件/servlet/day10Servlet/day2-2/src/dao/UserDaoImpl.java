package dao;

import java.sql.*;

import common.DBUtil;
import entity.User;

public class UserDaoImpl extends DaoImpl implements UserDao {

	@Override
	public User queryUserByName(String name) {
		User user = null;
		Connection con = DBUtil.getConn();
		PreparedStatement st = null;
		//定义sql
		String sql = "select userid from users where username=?";
		try {
			//根据sql创建数据库    预编译操作对象
			st = con.prepareStatement(sql);
			//参数赋值
			st.setString(1, name);
			//执行sql语句
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				int userid = rs.getInt("userid");
				user = new User(userid, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
		return user;
	}

}
