package DBUtil;

import java.sql.*;

public class DB_Connect {

	public static Connection getConn() throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url,"root","");
	}}