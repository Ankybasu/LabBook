package com.capgemini.hashcodeandequals;

import com.capgemini.hashcodeandequals.service.ProductManager;

public class ProductMain {
	public static void main(String[] args) {
		ProductManager ob=new ProductManager();
		ob.createProduct();
		ob.compareProducts();
		ob.print();
		ob.sort();
		ob.sortProductUsingName();
		ob.sortProductUsingProductID();
		ob.sortProductUsingProductPrice();
	}
}
