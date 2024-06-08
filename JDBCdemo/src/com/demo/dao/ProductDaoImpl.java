package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static PreparedStatement pinsert,pDelete,pSelect,pSelectbyid,pUpdatebyname;
	
	static {
		conn=DBUtil.getMyConnection();
		try {
			pinsert=conn.prepareStatement("Insert into employee values(?,?,? )");
			pDelete=conn.prepareStatement("Delete from employee where empid=?");
			pSelect=conn.prepareStatement("Select * from employee");
			pSelectbyid=conn.prepareStatement("Select * from  employee where empid=?");
			pUpdatebyname=conn.prepareStatement("update employee set empname=? where empid=?");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void save(Product p) {
		try {
			pinsert.setInt(1, p.getPid());
			pinsert.setString(2, p.getName());
			pinsert.setString(3, p.getAdd());
			
			int n=pinsert.executeUpdate();
			if(n>0)
			{
				System.out.println("Insertion Done ");
			}
			else
			{
				System.out.println("operation failed");
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean removebyId(int empid) {
		
		try {
			pDelete.setInt(1, empid);
			int n=pDelete.executeUpdate();
			if(n>0)
			{
				return true;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Product> findall() {
		try {
			ResultSet rs=pSelect.executeQuery();
			List<Product>plst=new ArrayList<>();
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
				plst.add(p);
			}
			return plst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Product searchById(int empid) {
		try {
			pSelectbyid.setInt(1, empid);
			ResultSet rs=pSelectbyid.executeQuery();
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
				return p;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public void updatebyid(String empname,int  empid) {
		
			
			try {
				pUpdatebyname.setString(1, empname);
				pUpdatebyname.setInt(2, empid);
				pUpdatebyname.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

	@Override
	public void closeConn() {
		DBUtil.closeMyConnection();
	}
	

}
