package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.beans.Address;
import com.hcl.beans.College;
import com.hcl.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/hcl/config/config.xml");
		
//		College stud=ctx.getBean("college",College.class);
//		
//		System.out.print(stud.toString());
		
	}

}
