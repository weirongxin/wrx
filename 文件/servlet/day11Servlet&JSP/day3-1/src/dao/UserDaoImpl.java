package dao;

import java.sql.*;

import common.DBUtil;
import entity.User;

public class UserDaoImpl extends DaoImpl implements UserDao {

	@Override
	public User querUserByName(String name) {
		User user = null;
		Connection conn = DBUtil.getCon();
		PreparedStatement st = null;
		
		String sql = "select userid,username,userpass,tel,gender,"
				+ "likes from users where username = ?";
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				 String userid = rs.getString("userid");
				 String username = rs.getString("username");
				 String userpass = rs.getString("userpass");
				 String tel = rs.getString("tel");
				 String gender = rs.getString("gender");
				 String likes = rs.getString("likes");
				 user = new User(userid, username, userpass,
						 gender, tel, likes);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn);
		}
		return user;
	}

	@Override
	public void insertUser(User user) {
		String sql = "insert into users(userid,username,"
						   + "userpass,tel,gender,likes) "
					 + "values(user_seq.nextval,?,?,?,?,?)";
		update(sql, user.getUserName(),user.getUserPass(),
				user.getTel(),user.getGender(),user.getLikes());
	}

}
