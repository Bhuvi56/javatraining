package com.example.entity;

public class Invoice {
	
	private int invoiceNumber;
	private String customerName;
	private double Quantity;
	private int productRef;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, String customerName, double quantity, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		Quantity = quantity;
		this.productRef = productRef;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return Quantity;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	public int getProductRef() {
		return productRef;
	}
	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", Quantity=" + Quantity
				+ ", productRef=" + productRef + "]";
	}

}
