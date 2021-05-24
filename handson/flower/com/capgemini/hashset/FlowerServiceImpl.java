package com.capgemini.hashset;

import java.util.Scanner;

public class FlowerServiceImpl implements FlowerService{
	Scanner sc=new Scanner(System.in);
	@Override
	public void create(Flower f) {
		// TODO Auto-generated method stub
		 int fid;
		 String fname;
		 double pricePerKg;
		 int qty;
		System.out.println("Enter the flower details: ");
		System.out.println("Enter the flower id: ");
		fid=sc.nextInt();
		System.out.println("Enter the flower name: ");
		sc.nextLine();
		fname=sc.nextLine();
		System.out.println("Enter the price: ");
		pricePerKg=sc.nextDouble();
		System.out.println("Enter the quantity: ");
		qty=sc.nextInt();
		f.setFid(fid);
		f.setFname(fname);
		f.setPricePerKg(pricePerKg);
		f.setQty(qty);
	}

}
