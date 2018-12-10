package common;

import java.sql.*;

public class DBUtil {
	
	public static Connection getCon(){
		Connection conn=null;
		try {
			Class.forName(DBConfig.DBDRIVER);
			conn = DriverManager.getConnection(DBConfig.DBURL, DBConfig.DBUSER, DBConfig.DBPASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void closeConn(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
