package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bhu_credit_card")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
	
	@Id
	@Column(name = "card_number")
	long cardNumber;
	
	
	@Column(name = "card_holder_name")
	String cardHolderName;
	
	@Column(name = "credit_limit")
	double creditLimit;
	

}
