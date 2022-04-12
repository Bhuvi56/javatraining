package com.training;

public class Patient {
	private double patientId;
	private  String patientName;
	private String location;
	private double mobileNumber;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(double patientId, String patientName, String location, double mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}
	public double getPatientId() {
		return patientId;
	}
	public void setPatientId(double patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]";
	}
		


}
