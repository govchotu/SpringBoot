package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Doctordata")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="Did")
	private Integer did;
	//@Column(name="Dname")
	private String dname;
//	@Column(name="Dspeciality")
	private String dspecaility;
	//@Column(name="Dmbenum")
	private Long dmobilenum;
//	@Column(name="DAdress")
	private String Address;

}
