package com.training;

public class Customer {
	private String customerName;
	private double customerMobileNumber;
	private String customerAddress;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(double customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Customer(String customerName, double customerMobileNumber, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerMobileNumber = customerMobileNumber;
		this.customerAddress = customerAddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
