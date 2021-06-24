package com.capgemini.orderapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.model.Seller;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	//int bid, String bName, String bCity, String bState
	@RequestMapping("/showSellers")
	public Seller show() {
		Seller s=new Seller(20,"Dominoes","Hyderabad","AP");
		return s;
	}
}