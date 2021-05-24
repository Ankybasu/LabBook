package com.capgemini.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Flower f;
		HashSet<Flower> fl = new HashSet<>();
		FlowerService ob1=new FlowerServiceImpl();
		char c='y';
		do {
			System.out.println("Enter choice:\n"
					+ " 1 for entering flower details\n"
					+ " 2 to display the flowers\n"
					+ " 3 to remove the flower with 0 quantity");
			int ch=sc.nextInt();
			if(ch==1) {
				f=new Flower();
				ob1.create(f);
				fl.add(f);
			}
			if(ch==2) {
				Iterator<Flower> itr = fl.iterator();
				System.out.println("Flower values using Iterator");
				while(itr.hasNext()) {
					System.out.println(itr.next());
					System.out.println();
				}
			}
			if(ch==3) {
				Iterator<Flower> itr = fl.iterator();
				while(itr.hasNext()) {
					Flower st = itr.next();
					if(st.getQty()==0) {
						itr.remove();
					}

				}	

			}
			if(ch==0) {
				System.exit(0);
			}
			System.out.println("continue? enter y/n");
			c=sc.next().charAt(0);
		}while(c=='y');
		sc.close();

	}

}

