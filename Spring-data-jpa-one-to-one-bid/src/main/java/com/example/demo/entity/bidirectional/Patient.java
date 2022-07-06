package com.example.demo.entity.bidirectional;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="bhu_patient_otm_bid")

@Data

@NoArgsConstructor
public class Patient {
	
	
	    @Id
	    @Column( name="Patient_Id")
		int patientId;
	    
	    @Column(name="Patient_Name")
		String patientName;
	    
	    
	    @Column(name="mobile_Number")
		long mobileNumber;
	    
	    
	    @ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name="doctor_ref")
	    
	    private Doctor doctor;


		public Patient(int patientId, String patientName, long mobileNumber) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.mobileNumber = mobileNumber;
		}


		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", mobileNumber=" + mobileNumber
					+ "]";
		}

		

		
	    

}
