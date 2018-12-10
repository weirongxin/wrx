package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;
import entity.ShiJuan;
import entity.TiMu;

public class TiMuDaoImpl extends DaoImpl implements TiMuDao {

	@Override
	public List<TiMu> queryByShiJuanId(int Id) {
		List<TiMu> tiMus = new ArrayList<TiMu>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select id,name,xuhao from wh_timu where shijuan_id=?";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int xuhao = rs.getInt("xuhao");
				TiMu t = new TiMu(id, name, xuhao, Id);
				tiMus.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
		return tiMus;
	}

}
