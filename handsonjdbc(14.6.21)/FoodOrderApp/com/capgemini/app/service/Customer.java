package com.capgemini.app.service;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.capgemini.app.exceptions.InvalidEmailException;
import com.capgemini.app.exceptions.PasswordException;
import com.capgemini.app.exceptions.PhoneNumberException;


public class Customer{
	static Connection con=null;
	static Statement stmt=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static int count=1;
	static Scanner sc=new Scanner(System.in);
	String cName,cpwd,email,pNo;
	int cid,tem;
	//method to establish the connection
	public Connection dbConnection() {
		try {
			//step 1: register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2: Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Popo@1991");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

	}//close of db connection method
	public void createCustomer() {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String createSe="create sequence seq_CIE start with 1 increment by 1";
			stmt.executeUpdate(createSe);
			String createTable="create table customers(cid int primary key ,cname varchar2(20),email varchar2(30),cpwd varchar2(30),pNo varchar2(11))";
			int i=stmt.executeUpdate(createTable);
			if(i==0) {
				System.out.println("Customer Table created successfully");
			}
			else {
				System.out.println("Table not created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void loginCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter details: ");
		System.out.println("=========================");
		System.out.println("Enter the customer name: ");
		cName=sc.next();
		System.out.println("Enter the customer password: ");
		cpwd=sc.next();
		int temp = 0;
		boolean flag=false;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from customers");
			while(rs.next()) {
				if(rs.getString(2).equals(cName)&&rs.getString(4).equals(cpwd)) {
					System.out.println("Customer exists!");
					temp=rs.getInt(1);
					flag=true;
					break;
				}

			}
			if(flag==true) {
				Vendor v=new Vendor();
				v.displayVendor(temp);
			}
			else {
				System.out.println("Invalid details");
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt==null) {
					throw new Exception();
				}
				stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	public void registerCustomer() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter customer name: ");
			cName=sc.next();
			System.out.println("Enter email: ");
			email=sc.next();
			if(!(email.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$"))) {
				throw new InvalidEmailException("Invalid email!");
			}

			System.out.println("Enter password: ");
			cpwd=sc.next();
			if(!cpwd.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}")){
				throw new PasswordException("Invalid Password");
			}

			System.out.println("Enter phone no: ");
			pNo=sc.next();
			if(pNo.isBlank()) {
				throw new PhoneNumberException("Phone number cannot be null");
			}
			if(pNo.length()!=11) {
				throw new PhoneNumberException("Phone number should be 11 digits");
			}
			if(!pNo.matches("\\d+")) {
				throw new PhoneNumberException("Phone number can contain only digits!");
			}
			if(!this.pNo.startsWith("0")) {
				throw new PhoneNumberException("Phone number should start with zero!");
			}
			String insertData="insert into customers values(seq_CIE.nextval,?,?,?,?)";
			pstmt=con.prepareStatement(insertData);
			pstmt.setString(1, cName);
			pstmt.setString(2, email);
			pstmt.setString(3, cpwd);
			pstmt.setString(4, pNo);


			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Data not inserted");
			}
		}
		catch(InvalidEmailException e1) {
			System.out.println(e1.getMessage());
		}
		catch(PhoneNumberException e2) {
			System.out.println(e2.getMessage());
		}
		catch(PasswordException e3) {
			System.out.println(e3.getMessage());
		}
		catch(Exception e) {
			e.getStackTrace(); 
		}
		finally {
			try {
				if(pstmt==null) {
					throw new Exception();
				}
				pstmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Customer not created");
			}
		}
	}//close of method insertIntoProductusingps
	public void displayCustomer() {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from customers");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(3)+"\t"+rs.getString(4));

			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt==null) {
					throw new Exception();
				}
				stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occured");
			}
		}	

	}
}

