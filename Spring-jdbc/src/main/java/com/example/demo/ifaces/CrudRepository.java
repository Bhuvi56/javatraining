package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository<T> {
	
	public int add(T t);
	public List<T>findAll();
	
	
	public Optional<T> findById(int id);
	public int update (T t);
	
	public int remove(int id);
}