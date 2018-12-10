package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConn(){
		Connection con = null;
		try {
			Class.forName(DBConfig.DBDriver);
			con = DriverManager.getConnection(
					DBConfig.DBURL, 
					DBConfig.DBUser, 
					DBConfig.DBPass);
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
