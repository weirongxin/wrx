package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import common.DBUtil;
import entity.ShiJuan;

public class ShiJuanDaoImpl extends DaoImpl implements ShiJuanDao {

	@Override
	public Map<Integer,ShiJuan> queryAll() {
		Map<Integer,ShiJuan> shiJuans = new HashMap<Integer,ShiJuan>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select id,name from wh_shijuan";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				ShiJuan s = new ShiJuan(id, name);
				shiJuans.put(id, s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
		return shiJuans;
	}

}
