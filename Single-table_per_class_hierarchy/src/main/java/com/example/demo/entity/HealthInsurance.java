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
@DiscriminatorValue(value = "HEALTH")
public class HealthInsurance  extends Insurance{
	
	@Column(name = "age")
	int age;
	
	@Column(name = "status")
	String status;
	public HealthInsurance(int policyNumber, String policyholderName, int age, String status) {
		super(policyNumber, policyholderName);
		this.age = age;
		this.status = status;
	}

}
