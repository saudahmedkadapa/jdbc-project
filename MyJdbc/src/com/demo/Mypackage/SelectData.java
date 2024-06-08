package com.demo.Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {
	public void ReadData() {
		try
		{
			String url="jdbc:mysql://localhost:3306/db";
			String username="root";
			String password="manager";
			
			Connection conn=DriverManager.getConnection(url, username, password);
			
			String query ="select * from student";
			Statement stm = conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("id="+rs.getInt(1)+"|"+ "name="+rs.getString(2)+"|"+"Address="+rs.getString(3));
				
			}
			
			System.out.println("Read Successfully");
			conn.close();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
			


