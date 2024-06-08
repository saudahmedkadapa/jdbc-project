package com.demo.Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDb {

	public void CreateDatabase() {
		
		
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String username="root";
			String password="manager";
			Connection conn=DriverManager.getConnection(url, username, password);
            Statement stm=conn.createStatement();
			
			System.out.println("Connection successfully");
			String query ="create database DB";
			boolean bl=stm.execute(query);
			System.out.println("Database created Successfully");
			conn.close();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
		
	

	


	
	
		
	


