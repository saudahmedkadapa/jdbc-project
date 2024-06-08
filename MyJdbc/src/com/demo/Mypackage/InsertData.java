package com.demo.Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData {
	public void CreateData() {
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String database="db";
			String username="root";
			String password="manager";
			
			Connection conn=DriverManager.getConnection(url+database, username, password);
            Statement stm=conn.createStatement();
			
			
			//String query ="INSERT into student(rollno,name,emailid) VALUES(1,'Saud','saud@gmail.com')";
            //String query="INSERT into student (rollno,name,emailid) VALUES (2,'Ahmed','ahmed@gmail.com')";
            //stm.execute(query);
            
            
            
            // insert using prepared statemnt
          String query ="INSERT into student(rollno,name,emailid) VALUES(?,?,?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setInt(1, 4);
          pstm.setString(2, "Virat");
          pstm.setString(3, "Virat@gmail.com");
            
            
            
			pstm.executeUpdate();
			System.out.println("Insert Data Successfully");
			conn.close();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
	}



}
