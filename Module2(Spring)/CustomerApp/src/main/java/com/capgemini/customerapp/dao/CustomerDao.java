package com.capgemini.customerapp.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.customerapp.entity.Customers;
import com.capgemini.customerapp.util.HibernateUtil;


public class CustomerDao {
	//inserting the customer
	public void saveCustomer(Customers customer) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the customer object
			session.saveOrUpdate(customer);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
