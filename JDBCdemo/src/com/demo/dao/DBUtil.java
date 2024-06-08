package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	public static Connection getMyConnection()
	{
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/dacdb";
				conn=DriverManager.getConnection(url,"root","manager");
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void closeMyConnection()
	{
		try {
			conn.close();
			System.out.println("Connection close!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();			
		}
		
	}
}
