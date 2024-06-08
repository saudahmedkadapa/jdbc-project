package com.demo.Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("1.Create Database \n 2.INsert Data in table\n 3.Select Data\n 4.Create Table\n  5.Update ");
		
		int choice=sc.nextInt() ;
		switch(choice)
		{
		case 1:
			CreateDb create=new CreateDb();
			create.CreateDatabase();
			
			break;
		case 2:
			InsertData insert=new InsertData();
			insert.CreateData();
			break;
		case 3:
			SelectData select=new SelectData();
			select.ReadData();
			break;
		case 4:
			Table tab=new Table();
			tab.CreateTable();
			break;
		case 5:
			Update update=new Update();
			update.UpdateData();
			break;
			default:
				System.out.println("Invalid");
		}
		
		
		

	}

}
