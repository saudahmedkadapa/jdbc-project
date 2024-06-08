package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductCrudDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		ProductService pservice=new ProductServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new product\n 2. delete by id\n3. display all");
			System.out.print("4. display by id\n 5. update product \n");
			System.out.print(" 6. exit \n choice: ");
		
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				pservice.addNewProduct();
				break;
			case 2:
				System.out.println("Enter emp id to delete ");
				int empid=sc.nextInt();
				boolean status=pservice.deletebypid(empid);
				if(status)
				{
					System.out.println("Deleted Successfully");
				}
				else
				{
					System.out.println("operation Failed");
				}
				default:
					System.out.println("Invalid Chooice!!");
					break;
				case 3:
					List<Product>plst=pservice.displayAll();
					plst.forEach(System.out::println);
					break;
				case 4:
					System.out.println("Display by id");
					empid=sc.nextInt();
					Product p=pservice.displaybyid(empid);
					if(p!=null)
					{
						System.out.println(p);
					}
					else
					{
						System.out.println("not found");
					}
					break;
				case  5:
					pservice.updatebyID();
					break;
				case 6:
					pservice.closeConn();
					System.out.println("Thank you !!");
					break;
					
					
		}
		
		}while(choice!=8);

	}
}



