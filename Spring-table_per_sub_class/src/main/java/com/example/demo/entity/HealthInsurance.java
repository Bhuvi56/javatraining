package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bhu_health_insurance")
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "policy_number")
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
