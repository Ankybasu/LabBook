package com.cg.eis.bean;

public class Employee {
	static int count=0;
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public Employee() {
		super();
	}
	public Employee(String name, double salary, String designation) {
		super();
		this.id=count;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		++count;
		this.id=count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
}
