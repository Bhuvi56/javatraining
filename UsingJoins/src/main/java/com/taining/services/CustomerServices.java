package com.taining.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import com.example.ifaces.CrudRepository;
import com.training.LoanApplication;
import com.training.model.Customer;

public class CustomerServices implements CrudRepository<LoanApplication> {
	

	private Connection con;

	public CustomerServices(Connection con) {
		super();
		this.con = con;
	}
	
public List<LoanApplication> findAll() {
		
		List<LoanApplication> appFindAll = new ArrayList<LoanApplication>();
        String sql = "SELECT * FROM bhu_customer bc LEFT OUTER JOIN "
        		+ "bhu_loanapplication bl ON bc.customer_id=bl.customer_ref";
        try(PreparedStatement pstmt = con.prepareStatement(sql)){
        	
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			      int customerId=rs.getInt("customer_id");
			      String customerName= rs.getString("customer_name");
			      double creditScore=rs.getDouble("credit_score");
			     int applicationNumber=rs.getInt("application_number");
			     long phoneNumber=rs.getLong("phone_number");
				 double loanAmount =rs.getDouble("loan_amount");
				Customer customer= new Customer(customerId, customerName, phoneNumber, creditScore);
				 LoanApplication cus = new LoanApplication(applicationNumber, customer, loanAmount);
				 
						 appFindAll.add(cus);
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		return appFindAll;
		
	}



public int add(LoanApplication obj) {
	
	int rowAdded=0;
	
	String sql = "insert into bhu_customer values(?,?,?,?)";
	String sql1 = "insert into bhu_loanapplication values(?,?,?)";
	try(PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql1)){
		
		pstmt.setInt(1, obj.getCustomer().getCustomerId());
	
		pstmt.setString(2,obj.getCustomer().getCustomerName());
	    pstmt.setLong(3, obj.getCustomer().getPhoneNumber());
     	pstmt.setDouble(4, obj.getCustomer().getCreditScore());
		pstmt2.setInt(1,obj.getApplicationNumber());
		pstmt2.setInt(2,obj.getCustomer().getCustomerId());
		pstmt2.setDouble(3, obj.getLoanAmount());
		
		 pstmt.executeUpdate();
		 rowAdded= pstmt2.executeUpdate();
		
	}catch(SQLException e) {
		e.printStackTrace();
		
		
	}
	return rowAdded;
	
}

@Override
public int remove(int id) {
	
	int rowsDeleted = 0;
	String sql = "delete from bhu_customer where customer_id=?";
	String sql1 = " delete from bhu_loanapplication where customer_ref=?";
	
	try (PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql1)){
	      pstmt.setInt(1, id);
	      pstmt2.setInt(1,id);
	      
	      rowsDeleted = pstmt.executeUpdate();
	     pstmt2.executeUpdate();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	    return rowsDeleted;

	
}


@Override
public int update(int cusId, int appNo) {
	
	int rowsUpdate=0;
	String sql ="update bhu_customer set phone_Number=? where customer_id=?";
	String sql1 ="update bhu_loanapplication set loan_amount=? where application_number=?";
	
	try (PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql1)){
		  pstmt.setInt(2,cusId);
	      pstmt.setLong(1,appNo);
		pstmt2.setDouble(1,cusId);
	      pstmt2.setInt(2,appNo);
		  
	      rowsUpdate = pstmt.executeUpdate();
	      pstmt2.executeUpdate();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	
	return rowsUpdate;
}



@Override
public LoanApplication findById(int id) {
	// TODO Auto-generated method stub
	return null;
}





}
