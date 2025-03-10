package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorservice;

@SpringBootApplication
public class SprinBootCrudApp1Application {

	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(SprinBootCrudApp1Application.class, args);
		//get the service class obj ref
		IDoctorservice service=context.getBean("doctorservice",IDoctorservice.class);
	
		try {
	    // create the object of entity class
		Doctor doctor=new Doctor();
		doctor.setDid(101);
		doctor.setDname("gov");
		doctor.setIncome(45000.0);
		doctor.setSpeciality("MD");
		
		//invoke the business method 
		String resultmsg=service.registerDoctor(doctor);
		System.out.println(resultmsg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	
	}

}
