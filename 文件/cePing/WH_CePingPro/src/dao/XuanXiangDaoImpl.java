package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;
import entity.XuanXiang;

public class XuanXiangDaoImpl extends DaoImpl implements XuanXiangDao {

	@Override
	public List<XuanXiang> queryByTiMuId(int id) {
		List<XuanXiang> xuanxiangs = new ArrayList<XuanXiang>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select id,name,fenzhi,xuhao from wh_xuanxiang where timu_id=?";
		
		conn = DBUtil.getConn();
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()){
				int xxId = rs.getInt("id");
				String name = rs.getString("name");
				int xuhao = rs.getInt("xuhao");
				int fenzhi = rs.getInt("fenzhi");
				XuanXiang xx = new XuanXiang(xxId, name, xuhao, id, fenzhi);
				xuanxiangs.add(xx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(conn);
		}
		return xuanxiangs;
	}

}
