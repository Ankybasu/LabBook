package com.capgemini.vegetable.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.capgemini.vegetable.model.Vegetable;

public class VegetableManager {
	Scanner sc=new Scanner(System.in);
	static List<Vegetable > vegList=new ArrayList<Vegetable>();
	public void create() {
		System.out.println("Enter the vegetable details: ");
		System.out.println("=========================");
		System.out.println("Enter the vegetable id: ");
		int vegid=sc.nextInt();
		System.out.println("Enter the vegetable name: ");
		sc.nextLine();
		String vegName=sc.nextLine();
		System.out.println("Enter the vegetable price: ");
		double vegPrice=sc.nextDouble();
		Vegetable v=new Vegetable(vegid,vegName,vegPrice);
		vegList.add(v);
	}
	public void read() {
		  for(Vegetable i: vegList) {
		  if(i!=null) 
			  System.out.println(i);
		  }
		}
	public void update() {
		System.out.println("Enter the vegetable id to be updated: ");
		int vid=sc.nextInt();
		boolean flag=false;
		for(Vegetable i: vegList) {
			if(i.getVegid()==vid) {
				System.out.println("Enter the vegetable name: ");
				sc.nextLine();
				String vegName=sc.nextLine();
				System.out.println("Enter the vegetable price: ");
				double vegPrice=sc.nextDouble();
				i.setVegName(vegName);
				i.setVegPrice(vegPrice);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No such vegetable found!");
	}
	public void delete() {
		System.out.println("Enter the vegetable id to be deleted: ");
		int vid=sc.nextInt();
		Vegetable temp=null;
		boolean flag=false;
		for(Vegetable i: vegList) {
			if(i.getVegid()==vid) {
				temp=i;
				i=null;
				flag=true;
			}
		}
		vegList.remove(temp);
		if(flag==false)
			System.out.println("No such vegetable found!");
	}
	public void sort() {
		Collections.sort(vegList);
		System.out.println("===============");
		System.out.println("Sorted List");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p);
		}
	}
	
	public void sortProductUsingName() {
		Collections.sort(vegList, new VegetableNameComparator());
		System.out.println("===============");
		System.out.println("Sorted List using name");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p);
		}
	}
	
	public void sortProductUsingProductID() {
		Collections.sort(vegList, new VegetableIdComparator());
		System.out.println("===============");
		System.out.println("Sorted List using ID");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p);
		}
	}
	public void sortProductUsingProductPrice() {
		Collections.sort(vegList, new VegetablePriceComparator());
		System.out.println("===============");
		System.out.println("Sorted List using price");
		System.out.println("===============");
		for(Vegetable p : vegList) {
			System.out.println(p);
		}
	}
}
