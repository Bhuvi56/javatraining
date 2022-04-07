package com.training.model;

import com.training.ifaces.Conditional;

public class Principal  implements Conditional{
	
	private String CollegeType;

	public String getCollegeType() {
		return CollegeType;
	}

	public void setCollegeType(String collegeType) {
		CollegeType = collegeType;
	}

	public Principal(String collegeType) {
		super();
		CollegeType = collegeType;
	}

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object value) {
		String CollegeType = (String)value;
		boolean result = false;
		if(CollegeType.equals("engg")){
			result =true;
		// TODO Auto-generated method stub
		
	}
		return result;
	

}
}
