package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name="doctor_infos")
public class Doctor {
	
	@Id
	@Column(name="Doc_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docid;
	
	@Column(name="Doc_name")
	private String docname;
	
	@Column(name="Doc_Speciality")
	private String speciality;
	

}
