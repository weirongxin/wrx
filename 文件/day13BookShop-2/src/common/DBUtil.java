package common;

import java.sql.*;

public class DBUtil {
	
	public static Connection getConn(){
		Connection con = null;
		try {
			Class.forName(DBConfig.DBDriver);
			con = DriverManager.getConnection(DBConfig.DBUrl,
					DBConfig.DBUser, DBConfig.DBPass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return con;
	}
	public static void closeConn(Connection con){
		try {
			if(con!=null){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
