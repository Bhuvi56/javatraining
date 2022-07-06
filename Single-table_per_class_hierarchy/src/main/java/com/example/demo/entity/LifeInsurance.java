package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "LIFE")
public class LifeInsurance extends Insurance {
	
	
	
	
	@Column(name = "age")
	int age;
	
	@Column(name = "profile")
	String profile;
	
	
	public LifeInsurance(int policyNumber, String policyholderName, int age, String profile) {
		super(policyNumber, policyholderName);
		this.age = age;
		this.profile = profile;
	}
	
	


}
