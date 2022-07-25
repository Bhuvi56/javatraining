package com.example.demo.repos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Integer> {

	@Query(value = "update Donor set location=:updateLocation where donorId=:srchId")
	@Modifying
	@Transactional
    int modifyLocation(@Param("srchId")int donorId,@Param("updateLocation")String updateLocation);


	

}
