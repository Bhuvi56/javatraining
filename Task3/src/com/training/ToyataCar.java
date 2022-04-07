package com.training;

public class ToyataCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "2020";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String toString() {
		return "ToyataCar [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice()
				+ "]";
	}
	

}
