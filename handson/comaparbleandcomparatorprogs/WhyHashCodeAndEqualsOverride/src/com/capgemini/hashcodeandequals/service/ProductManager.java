package com.capgemini.hashcodeandequals.service;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.hashcodeandequals.model.Product;

public class ProductManager {
	ArrayList<Product> productList=new ArrayList<Product>();
	public void createProduct() {
		
//		  Product p=new Product(1234,"Pen",35); 
//		  Product p1=new Product(1234,"Pen",35);
		  Product p=new Product(1234,"Pen",35); 
		  Product p1=new Product(1235,"Eraser",10);
		 
	productList.add(p);
	productList.add(p1);
	}
	public void compareProducts() {
		if(productList.get(0).equals(productList.get(1))) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equal");
		}
	}
	public void print() {
		System.out.println("Before sorting: ");
		for(Product i: productList) {
			System.out.println(i);
		}
		System.out.println("After sorting: ");
		Collections.sort(productList);
		for(Product i: productList) {
			System.out.println(i);
		}
	}
	public void sort() {
		Collections.sort(productList);
		System.out.println("===============");
		System.out.println("Sorted List");
		System.out.println("===============");
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	
	public void sortProductUsingName() {
		Collections.sort(productList, new ProductNameComparator());
		System.out.println("===============");
		System.out.println("Sorted List using name");
		System.out.println("===============");
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	
	public void sortProductUsingProductID() {
		Collections.sort(productList, new ProductIdComparator());
		System.out.println("===============");
		System.out.println("Sorted List using ID");
		System.out.println("===============");
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	public void sortProductUsingProductPrice() {
		Collections.sort(productList, new ProductPriceComparator());
		System.out.println("===============");
		System.out.println("Sorted List using price");
		System.out.println("===============");
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	
}
