package com.capgemini.orderapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.model.Buyer;


@RestController
@RequestMapping("/buyer")
public class BuyerController {
	
	//int bid, String bName, String bCity, String bState
	@RequestMapping("/showBuyers")
	public Buyer show() {
		Buyer b=new Buyer(10,"Ram","Kolkata","WB");
		return b;
	}
}