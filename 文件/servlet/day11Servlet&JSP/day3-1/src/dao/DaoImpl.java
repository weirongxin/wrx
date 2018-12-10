package dao;

import java.sql.*;

import common.DBUtil;

public class DaoImpl implements Dao {

	@Override
	public void update(String sql, Object... args) {
		// TODO Auto-generated method stub
		Connection conn=DBUtil.getCon();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(sql);
			if(args.length>0){
				for(int i=0;i<args.length;i++){
					st.setObject(i+1, args[i]);
				}
				st.execute();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(conn);
		}
	}

}
