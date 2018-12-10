package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DBUtil;

public class DaoImpl implements Dao {

	@Override
	public void update(String sql, Object... args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DBUtil.getConn();
			st = conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				st.setObject(i+1, args[i]);
			}
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeConn(conn);

	}

}
