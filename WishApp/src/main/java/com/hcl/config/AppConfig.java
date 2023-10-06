package com.hcl.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.hcl.beans")
public class AppConfig {
	
	@Bean(name="ldt")
	public LocalDateTime creatTime()
	{
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
	

}
