package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpa01UsingSpringBootApplication {

	public static void main(String[] args) {
		
		//get ioc container
		ApplicationContext ctx=
				SpringApplication.run(BootDataJpa01UsingSpringBootApplication.class, args);
		
		//get service class obj
		IDoctorService service=ctx.getBean("doctorservice",IDoctorService.class);
		
		try
		{
		  //create entity class obj ref
			Doctor doctor=new Doctor();
			doctor.setDid(52);
			doctor.setDname("Banu");
			doctor.setAddress("Alur");
			doctor.setDmobilenum(9987829l);
			doctor.setDspecaility("SW");
			
			System.out.println(service.registerorUpdateDoctor(doctor));
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
		//close the container
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
