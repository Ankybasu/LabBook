package com.capgemini.collections;


public interface CustomerService {
	Customer entry(Customer c);
	void create(Customer c);
	boolean update(int id);
	void delete(int id);
	void displayById(int id);
	void displayAll();
}
