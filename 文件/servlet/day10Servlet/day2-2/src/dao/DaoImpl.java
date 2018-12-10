package dao;

import java.sql.*;
import common.DBUtil;

public class DaoImpl implements Dao {

	@Override
	public void update(String sql, Object... args) {
		//获取连接
		Connection con = DBUtil.getConn();
		//声明数据库操作对象
		PreparedStatement st = null;
		try {
			//根据连接对象和sql语句 生成预编译数据库操作对象
			st = con.prepareStatement(sql);
			//判断参数个数是否>0
			if(args.length>0){
				//遍历参数中的每个元素  
				for(int i=0;i<args.length;i++){
					//给预编译对象赋值
					st.setObject(i+1, args[i]);
				}
				//执行sql语句
				st.execute();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeConn(con);
		}
	}

}
