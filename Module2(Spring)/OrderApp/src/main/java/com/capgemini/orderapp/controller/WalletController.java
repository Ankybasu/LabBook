package com.capgemini.orderapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.model.Wallet;

//String walletType, int wid, double balance
@RestController
@RequestMapping("/wallet")
public class WalletController{
	
	//int bid, String bName, String bCity, String bState
	@RequestMapping("/showWallet")
	public Wallet show() {
		Wallet w=new Wallet("A",11,5000);
		return w;
	}
}