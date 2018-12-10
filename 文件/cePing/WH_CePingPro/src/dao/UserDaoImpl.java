package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;
import entity.User;

public class UserDaoImpl extends DaoImpl implements UserDao {

	@Override
	public List<User> queryUser() {
		List<User> users = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select id,name,pass from wh_user";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				User user = new User(id, name, pass);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
		return users;
	}

	@Override
	public User queryUserByName(String name) {
		User user = null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select id,pass from wh_user where name = ?";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			st.setObject(1, name);
			rs = st.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String pass = rs.getString("pass");
				user = new User(id, name, pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
		return user;
	}

	@Override
	public void insertUser(User u) {
		Connection conn = null;
		PreparedStatement st = null;
		String sql = "insert into wh_user(id,name,pass) values(wh_user_sq.nextval,?,?)";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			st.setObject(1, u.getId());
			st.setObject(2, u.getName());
			st.setObject(3, u.getPass());
			st.execute();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
	}

}
