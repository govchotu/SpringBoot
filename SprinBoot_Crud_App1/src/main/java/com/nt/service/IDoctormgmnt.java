package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repo.IDoctorRepo;

@Service("doctorservice")
public class IDoctormgmnt implements IDoctorservice {
	
	@Autowired
	private IDoctorRepo doctorrepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("before save doc id:"+doctor.getDid());
		Doctor doc=doctorrepo.save(doctor);
		//System.out.println("after save the record:"+doctor.getDid());
		return "doctor obj is save with id value:"+doctor.getDid();
	}
	

}
