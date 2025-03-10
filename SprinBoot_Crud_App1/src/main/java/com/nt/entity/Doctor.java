package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="doctor")
@Data
public class Doctor {
	
	@Id
	@Column(name="Doc_id")
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer did;
	
	@Column(name="Doc_name")
	private String dname;
	
	@Column(name="Doc_speciality")
	private String speciality;
	
	@Column(name="Doc_income")
	private double income;

}
