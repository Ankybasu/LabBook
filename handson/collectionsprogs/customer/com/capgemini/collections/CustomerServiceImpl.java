package com.capgemini.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.naming.InvalidNameException;

public class CustomerServiceImpl implements CustomerService{
	public static List<Customer> list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);

	@Override
	public Customer entry(Customer c){
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		sdf.setLenient(false);
		int cid;
		String custName;
		int age;
		Date dob;
		String email;
		String mobileNumber;
		String str;
		// TODO Auto-generated method stub
		System.out.println("Enter the customer details: ");
		System.out.println("=============================");
		try {
		System.out.println("Enter the id: ");
		cid=sc.nextInt();
		if(cid<=0)
			throw new InvalidIdException("Invalid Customer id");	
		System.out.println("Enter the customer name: ");
		sc.nextLine();
		custName=sc.nextLine();
		if(!(custName.matches("^[a-zA-Z\\s]*$"))) {
			throw new InvalidNameException("Only characters allowed! ");
		}
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		if(age==0||age>100) {
			throw new InvalidAgeException("Age not allowed!");
		}
		System.out.println("Enter the Date of Birth: dd/MM/YYYY format");
		sc.nextLine();
		str=sc.nextLine();
			dob=sdf.parse(str);
		System.out.println("Enter email: ");
		email=sc.next();
		if(!(email.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$"))) {
			throw new InvalidEmailException("Invalid email!");
		}
		System.out.println("Enter mobile number: ");
		mobileNumber=sc.next();
		if(age==0||age>100||!(mobileNumber.matches("^0{1}\\d{10}$"))) {
			throw new InvalidMobileNumberException("Invalid MobileNumber!");
		}
		c.setCid(cid);
		c.setCustName(custName);
		c.setAge(age);
		c.setDob(dob);
		c.setEmail(email);
		c.setMobileNumber(mobileNumber);
		}
		
		 catch (InvalidIdException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidMobileNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(InvalidNameException e) {
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public void create(Customer c){
		Customer c1=entry(c);
		list.add(c1);
	}

	@Override
	public boolean update(int id){
		// TODO Auto-generated method stub
		for(Customer i: list) {
			if(i.getCid()==id) {
				i=entry(i);
				return true;
			}
		}
		return false;	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		for(Customer i:list) {
			if(i.getCid()==id) {
				list.remove(i);
				break;
			}
		}
		
	}

	@Override
	public void displayById(int id) {
		// TODO Auto-generated method stub
		System.out.println("The details are: ");
		for(Customer i: list) {
			if(i.getCid()==id) {
				System.out.println(i);
				break;
			}
		}		
		
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		System.out.println("The details are: ");
		for(Customer i: list) {
			if(i.getCid()!=0)
				System.out.println(i);
		}
	}
}
