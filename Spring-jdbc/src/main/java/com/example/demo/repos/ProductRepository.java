package com.example.demo.repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository


public class ProductRepository implements CrudRepository<Product> {

	
	private JdbcTemplate template;
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	
	
	@Override
	public int add(Product t) {
	
		
		String sql="insert into bhu_product values(?,?,?)";
		
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
		
	}

	
	
	@Override
	public List<Product> findAll() {
		
		
		String sql="select * from bhu_product";
		
		
	return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	
	
//	@Override
//	public Product findById(int id) {
//                   
//		try {
//				   return template.queryForObject(
//			      "SELECT * FROM bhu_product WHERE product_id=?",
//			     BeanPropertyRowMapper.newInstance(Product.class),id);
//			    } 
//			catch (IncorrectResultSizeDataAccessException e)    	{
//			      return null;
//			    }
//			  }

	
	

	
	@Override
	public int update(Product t) {
	
	  return template.update(
		 "UPDATE bhu_product SET product_name=?,price=? WHERE product_id=?",
		 
		        new Object[] { 
		        		t.getProductName(),
		                t.getPrice(),
		        		t.getProductId()});
		  }

		
	
	
	@Override
	public int remove(int id) {

	  return template.update("DELETE FROM bhu_product WHERE product_id=?",id);
		
	}
//@SuppressWarnings("deprecation")
//@Override
//	public Optional<Product> findById1(int id) {
//	        return template.queryForObject ("select * from bhu_product where product_id = ?",
//	                new Object[]{id},
//	                (rs, rowNum) -> Optional.of
//	                (new Product(rs.getInt("product_id"),
//	                                rs.getString("product_name"),
//	                                rs.getDouble("price"))));
//	                        
//	    
//	        
//	        
//	    }



	@Override
	public Optional<Product> findById(int id) {
		
	Optional<Product> obj = Optional.empty();
		       Product found= template.queryForObject(
		                "select * from bhu_product where  product_id = ?",
		               BeanPropertyRowMapper.newInstance(Product.class),id);
		       return Optional.of(found);
		    }
	

}
