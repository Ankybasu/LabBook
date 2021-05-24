package com.capgemini.product;

public interface ProductService {
	void create(Product p);
	void update(Product p);
	boolean delete(int id);
	void displayAll();
	void displayById(int id);
}
