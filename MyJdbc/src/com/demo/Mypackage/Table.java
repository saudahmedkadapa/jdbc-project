package com.demo.Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table {
	public void CreateTable() {
		try
		{
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="manager";
			
			Connection conn=DriverManager.getConnection(url, username, password);
            Statement stm=conn.createStatement();
			
			
			String query ="create table student(rollno int(3),Name varchar(50),emailid varchar(50))";
			stm.execute(query);
			System.out.println("Table created Successfully");
			conn.close();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}	
	}
}
