package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void save(Product p);

	boolean removebyId(int empid);

	List<Product> findall();

	Product searchById(int empid);

	void updatebyid(String empname, int empid);

	void closeConn();

}
