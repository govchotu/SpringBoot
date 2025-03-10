package com.nt.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

import jakarta.transaction.Transactional;

@Service("doctorservice")
public class DoctormgmtServiceimpl implements IDoctorService {

    @Autowired
    private IDoctorRepo doctorrepo;

	@Override
	public String registerorUpdateDoctor(Doctor doctor) {
		
		doctorrepo.save(doctor);
		return "doctor is saved/updated..";
	}

}