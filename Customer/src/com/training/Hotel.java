package com.training;

public class Hotel {
	private String hotelName;
	private double hotelBranch;
	private String hotelLocation;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public double getHotelBranch() {
		return hotelBranch;
	}
	public void setHotelBranch(double hotelBranch) {
		this.hotelBranch = hotelBranch;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public Hotel(String hotelName, double hotelBranch, String hotelLocation) {
		super();
		this.hotelName = hotelName;
		this.hotelBranch = hotelBranch;
		this.hotelLocation = hotelLocation;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
	
	

}
