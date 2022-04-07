package com.training;

public class Employee {
	private String employeeName;
	private double employeeSalary;
	private int employeeId;
	public Employee(String employeeName, double employeeSalary, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeId = employeeId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	

}
