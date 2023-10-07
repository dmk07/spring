package com.hcl.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hcl.beans.Address;
import com.hcl.beans.Student;
import com.hcl.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Student stud=ctx.getBean("stud",Student.class);
		System.out.print(stud);
		}

}
