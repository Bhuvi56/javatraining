package com.example.demo.model;


import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@Data
@Getter
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Component
public class CustomerList {
	
	List<Customer> custList;

}
