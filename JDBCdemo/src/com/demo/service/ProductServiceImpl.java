package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	private ProductDao pDao;
	
	public ProductServiceImpl()
	{
		pDao=new ProductDaoImpl();
	}

	@Override
	public void addNewProduct() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Empid");
		int empid=sc.nextInt();
		System.out.println("Enter name ");
		String empname=sc.next();
		System.out.println("Enter address");
		String empadd=sc.next();
		Product p=new Product(empid,empname,empadd);
		pDao.save(p);
		
		
		
	}

	@Override
	public boolean deletebypid(int empid) {
		
		return pDao.removebyId(empid);
	}

	@Override
	public List<Product> displayAll() {
		
		return pDao.findall();
	}

	@Override
	public Product displaybyid(int empid) {
		
		return pDao.searchById(empid);
	}

	@Override
	public void updatebyID() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the empid to update details=");
		int empid=sc.nextInt();
		System.out.println("Enter the new name =");
		String empname=sc.next();
		
		pDao.updatebyid(empname,empid);
		
	}

	@Override
	public void closeConn() {
		pDao.closeConn();
		
	}

}
