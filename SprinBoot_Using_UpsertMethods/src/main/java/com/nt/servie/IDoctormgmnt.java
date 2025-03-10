package com.nt.servie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service
public class IDoctormgmnt implements IDoctorservice {
	
	@Autowired
	private IDoctorRepo doctorrepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc id( before save)"+doctor.getDocid());
		Doctor doc=doctorrepo.save(doctor);
		return "doc id after saving:"+doc.getDocid();
	}

}
