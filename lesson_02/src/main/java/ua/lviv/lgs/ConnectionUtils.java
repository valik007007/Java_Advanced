package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	private static String USER_NAME = "root";
	private static String USER_PASSWORD = "1236vn";
	private  static String URL = "jdbc:mysql://localhost/employees?useUnicode=true&serverTimezone=UTC&useSSL=false";	
		
	
	public static Connection  openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName ("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}	

}
