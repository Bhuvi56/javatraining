package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "bhu_insurance")
@Inheritance(strategy = InheritanceType.JOINED)
public class Insurance {
	
	@Id
	@Column(name="policy_number")
    int policyNumber;
	
	
	@Column(name="policy_holder_name",length = 30,nullable = false)
    String policyholderName;
    
    

}
