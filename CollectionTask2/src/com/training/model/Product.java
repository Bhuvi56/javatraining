package com.training.model;

public class Product {
	
	private double productId;
	private String productName;
	private double ratePerUnit;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(double productId, String productName, double ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public double getProductId() {
		return productId;
	}
	public void setProductId(double productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	

}
