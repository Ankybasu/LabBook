package com.capgemini.vegetable;

import java.util.Scanner;

import com.capgemini.vegetable.service.VegetableManager;

public class VegetableMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VegetableManager vm=new VegetableManager();
		char ch='y';
		do {
			System.out.println("Vegetable App: ");
			System.out.println("Enter 1 to create: ");
			System.out.println("Enter 2 to read: ");
			System.out.println("Enter 3 to update: ");
			System.out.println("Enter 4 to delete: ");
			System.out.println("Enter 5 to sort: ");
			System.out.println("Enter 6 to sort by id");
			System.out.println("Enter 7 to sort by name");
			System.out.println("Enter 8 to sort by price: ");
			int choice=sc.nextInt();
		switch(choice) {
		case 1:
			vm.create();
			break;
		case 2:
			vm.read();
			break;
		case 3:
			vm.update();
			break;
		case 4:
			vm.delete();
		case 5:
			vm.sort();
			break;
		case 6:
			vm.sortProductUsingProductID();
			break;
		case 7:
			vm.sortProductUsingName();
			break;
		case 8:
			vm.sortProductUsingProductPrice();
			break;
			default:
				System.out.println("Wrong choice!");
			System.out.println("Continue? y/n");
			ch=sc.next().trim().charAt(0);
		}
		}while(ch=='y');
		
	}

}
