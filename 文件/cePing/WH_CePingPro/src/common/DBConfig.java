package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
	public static String DBDriver;
	public static String DBURL;
	public static String DBUser;
	public static String DBPass;
	static{
		Properties  p = new Properties();
		InputStream in = DBConfig.class.getResourceAsStream("/db.properties");
		try {
			p.load(in);
			DBDriver = p.getProperty("oracle.driver");
			DBURL = p.getProperty("oracle.url");
			DBUser = p.getProperty("oracle.user");
			DBPass = p.getProperty("oracle.pass");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
