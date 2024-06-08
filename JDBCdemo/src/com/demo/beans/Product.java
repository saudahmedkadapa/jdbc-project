package com.demo.beans;

public class Product {
	private int pid;
	private String name ;
	
	private String add;
	public Product() {
		super();
	}
	public Product(int pid, String name,String add  ) {
		super();
		this.pid = pid;
		this.name = name;
		this.add=add;
		
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", add=" + add + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	

}
