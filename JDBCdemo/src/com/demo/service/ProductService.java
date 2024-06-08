package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addNewProduct();

	boolean deletebypid(int empid);

	List<Product> displayAll();

	Product displaybyid(int empid);

	void updatebyID();

	void closeConn();

}
