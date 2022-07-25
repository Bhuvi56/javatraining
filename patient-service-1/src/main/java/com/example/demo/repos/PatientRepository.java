package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Donor;
import com.example.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	@Query(value = "from Donor where location=:srchLocation")
    List<Donor> searchByLocation(@Param("srchLocation")String location);
	
	
	@Query(value = "from Donor where bloodGroup=:srchBloodGroup")
    List<Donor> searchByBloodGroup(@Param("srchBloodGroup")String bloodGroup);







}
