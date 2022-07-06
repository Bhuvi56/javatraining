package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bhu_life_insurance")
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "policy_number")
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
