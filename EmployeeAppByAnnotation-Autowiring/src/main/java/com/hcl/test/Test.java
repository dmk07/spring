package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.beans.Employee;

public class Test {

	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/hcl/config/config.xml");
		
		Employee emp;
		
		emp=ctx.getBean("emp",Employee.class);
		
		System.out.print(emp.toString());
		
		
		
		
	}

}
