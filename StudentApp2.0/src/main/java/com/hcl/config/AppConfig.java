package com.hcl.config;

import java.time.LocalDateTime;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hcl.beans.Address;
import com.hcl.beans.Student;

@Configuration
@ComponentScan(basePackages="com.hcl.beans")
public class AppConfig {
	
	
	@Bean(name="addr")
	public Address getAddress()
	{
		Address addr=new Address();
		return addr;
	}
	
	@Bean(name="stud")
	public Student getStudent()
	{
		Student stud=new Student();
		return stud;
	}
	
	

}
