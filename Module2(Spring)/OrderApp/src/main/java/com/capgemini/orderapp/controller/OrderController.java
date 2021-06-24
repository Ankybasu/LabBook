package com.capgemini.orderapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	//int bid, String bName, String bCity, String bState
	@RequestMapping("/showOrders")
	public Order show() {
		//String oName, int oid, double totAmount
		Order o=new Order("Pizza",156,800);
		return o;
	}
}