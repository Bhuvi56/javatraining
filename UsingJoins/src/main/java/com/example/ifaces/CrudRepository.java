package com.example.ifaces;

import java.util.List;

import com.training.LoanApplication;

public interface CrudRepository<T>{
	
	public int add(T obj);
	
	public List<T> findAll();
	
	public int remove(int id);
	
	public T findById(int id);
	
	//public int update(int Id,T obj);

	int update(int cusId, int appNo);



}
 