package com.capgemini.product;

import java.util.Scanner;

public class ProductServiceImpl implements ProductService{
	Scanner sc=new Scanner(System.in);
	public static int count=0;
	public static Product[] pArray=new Product[5];
	@Override
	public void create(Product p) {
		// TODO Auto-generated method stub
		pArray[count]=p;
		count++;
		p.setPid(count);
		System.out.println("Enter the product details: ");
		System.out.println("Enter the product name: ");
		p.setpName(sc.next());
		System.out.println("Enter the price: ");
		p.setPrice(sc.nextDouble());
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the product to be updated: ");
		p.setPid(sc.nextInt());
		System.out.println("Enter the product name: ");
		p.setpName(sc.next());
		System.out.println("Enter the price: ");
		p.setPrice(sc.nextDouble());
		for(int i=0;i<count;i++){
			if(pArray[i].getPid()==p.getPid())
			{
				pArray[i]=p;
				break;
			}
		}
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=0;i<count;i++){
			if(pArray[i].getPid()==id)
			{
				/*
				 * pArray[i]=null; flag=true;
				 */

				if(id==1) { 
					pArray[i]=null; 
					count--; 
					flag=true; 
					return flag;
				} 
				else {
					pArray[i]=pArray[i+1]; 
					count--; 
					flag=true;
					return flag; 
				}
			}
		}
		return flag;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		if(count==0) {
			System.out.println("No element yet!");
		}
		else {
		for(int i=0;i<count;i++){
			System.out.println(pArray[i]);
		}
		}
	}

	@Override
	public void displayById(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++){
			if(pArray[i].getPid()==id)
			{
				System.out.println(pArray[i]);
			}
		}

	}


}
