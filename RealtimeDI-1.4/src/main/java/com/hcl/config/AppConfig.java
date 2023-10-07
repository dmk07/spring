package com.hcl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.hcl")
@PropertySource(value="com/hcl/comp/info.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	
	@Bean(name="oracleDS")
	public DriverManagerDataSource createDataSource()
	{
		
		DriverManagerDataSource drds=new DriverManagerDataSource();
		drds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		drds.setUrl(env.getRequiredProperty("jdbc.url"));
		drds.setUsername(env.getProperty("jdbc.username"));
		drds.setPassword(env.getProperty("jdbc.password"));
		return drds;
		
	}
	

}
	
	
	
	

