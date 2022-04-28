package com.example.dao;
import java.time.LocalDate.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import java.time.Duration;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
     private Connection con;
	
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	
	public List<Member> findAll() {
		
		List<Member> memberFindAll = new ArrayList<Member>();
        String sql = "select * from acheckmember";
        try(PreparedStatement pstmt = con.prepareStatement(sql)){
        	
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
			
			     int memberId=rs.getInt("member_id");
				 String memberName=rs.getString("member_name");
				 String memberAddress =rs.getString("member_address");
				 LocalDate date = LocalDate.of(2022, 4, 26);
				 Date sqlDate= Date.valueOf(date);
				 Date accountOpenDate=rs.getDate("acc_open_date");
				 String memberShipType = rs.getString("membership_type");
				 double feesPaid=rs.getDouble("fees_paid");
				 int maxBookAllowed =rs.getInt("max_books_allowed");
				 double penaltyAmount=rs.getDouble("penalty_amount");
				 
				 Member mem = new Member(memberId, memberName, memberAddress, accountOpenDate, memberShipType, 
						 feesPaid, maxBookAllowed, penaltyAmount);
				 
						 memberFindAll.add(mem);
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		return memberFindAll;
		
	}

	public int remove(int id) {
		int rowsRemoved = 0;
		String sql = "delete from acheckmember where member_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
		      pstmt.setInt(1, id);
		      rowsRemoved = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowsRemoved;
	}

	public Member findById(int id) {
	
		return null;
	}

	


	@Override
	public int add(Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
