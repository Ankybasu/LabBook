package com.capgemini.product;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Product p;
		ProductService ob1=new ProductServiceImpl();
		char c='y';
		do {
			System.out.println("Product Menu: ");
			System.out.println("Enter choice:\n"
					+ " 1 to create\n"
					+ " 2 to update\n"
					+ " 3 to delete\n"
					+ " 4 to display all\n"
					+" 5 to displayby id");
			System.out.println("===============================");
			int ch=sc.nextInt();
			if(ch==1) {
				p=new Product();
				ob1.create(p);
			}
			if(ch==2) {
				p=new Product();
				ob1.update(p);
			}
			if(ch==3) {
				System.out.println("Enter product id: ");
				int id=sc.nextInt();
				boolean result=ob1.delete(id);
				if(result==false)
					System.out.println("No such product found!");

			}
			if(ch==4) {
				ob1.displayAll();
			}
			if(ch==5) {
				System.out.println("Enter the product Id");
				int id=sc.nextInt();
				ob1.displayById(id);
			}
			if(ch==0) {
				System.exit(0);
			}
			System.out.println("continue? enter y/n");
			c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();

	}

}
