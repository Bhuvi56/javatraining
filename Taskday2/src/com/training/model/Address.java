package com.training.model;

public class Address {
	private int doorNo;
	private String streetName;
	private String placeName;
	
	
	
	public Address(int doorNo, String streetName, String placeName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.placeName = placeName;
	}
	
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", placeName=" + placeName + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	

}
