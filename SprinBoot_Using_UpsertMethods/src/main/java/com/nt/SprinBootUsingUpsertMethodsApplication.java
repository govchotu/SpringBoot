package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nt.entity.Doctor;
import com.nt.servie.IDoctorservice;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nt.repository")
@EntityScan(basePackages = "com.nt.entity")
public class SprinBootUsingUpsertMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(SprinBootUsingUpsertMethodsApplication.class, args);
		
		//get service class obj ref
		
		IDoctorservice service=ctx.getBean(IDoctorservice.class);
		
		// creat entity class obj\
		try {
		Doctor doctor=new Doctor();
		//doctor.setDocid(777);
		doctor.setDocname("Nari");
		doctor.setSpeciality("Mbbs");
		String resultmsg=service.registerDoctor(doctor);
		System.out.println(resultmsg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext)ctx).close();
	}

}
