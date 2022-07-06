package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "bhu_driver")


public class Driver {
	
	@Id
    @Column(name = "id")
    int driverId;
	
    @Column(name = "name")
    String  driverName;
    
    @Column(name = "mobile_number")
    long mobileNumber;
    
    @Column(name = "rating")
    double rating;


}
