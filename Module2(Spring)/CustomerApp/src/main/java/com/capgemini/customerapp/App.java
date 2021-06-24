package com.capgemini.customerapp;

import com.capgemini.customerapp.dao.CustomerDao;
import com.capgemini.customerapp.entity.Addresses;
import com.capgemini.customerapp.entity.Customers;
import com.capgemini.customerapp.entity.Items;
import com.capgemini.customerapp.entity.Orders;

/**
 * 
 * @author ANKITA BASU
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//one to one 
        Customers customer = new Customers("John Doe");
        Customers customer1 = new Customers("Bruce Wayne");
       Addresses add= new Addresses("12 Main St., Houston TX 77001");
       Addresses add1= new Addresses("1007 Mountain Dr.,Gotham NY 10286");
        CustomerDao customerDao = new CustomerDao();
        
        //adding the addresses to the customers
        customer.setAddress(add);
        customer1.setAddress(add1);
        
        /*
         * one to many
         * one customer can have many orders
         */
        //creating the orders
        Orders order=new Orders("12/24/09",156.78);
        Orders order1=new Orders("12/25/09",99.99);
        Orders order2=new Orders("12/26/09",75.0);
        
        //adding the orders to the customers
        customer.getOrders().add(order);
        customer.getOrders().add(order2);
        customer1.getOrders().add(order1);
        
        /*
         * many to many
         * one item can have many orders
         * and one order can have many items
         */
        //creating the items
        Items item=new Items("Tickle Me Elmo","It wants to be tickled");
        Items item1=new Items("District 9 DVD","Awesome sci-fi movie");
        Items item2=new Items("Batarang","It is very sharp");
        
        //adding the items to the orders
        order.getItems().add(item);
        order.getItems().add(item1);
        order1.getItems().add(item1);
         order1.getItems().add(item2);
        
         //adding the orders to the items
        item.getOrder().add(order);
        item1.getOrder().add(order);
        item1.getOrder().add(order1);
        item2.getOrder().add(order1);
        
        customerDao.saveCustomer(customer);
        customerDao.saveCustomer(customer1);
        
    }
}
