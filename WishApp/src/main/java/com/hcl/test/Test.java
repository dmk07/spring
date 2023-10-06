package com.hcl.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.beans.WishMessage;
import com.hcl.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx=new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessage generate=ctx.getBean("wmg",WishMessage.class);
		System.out.print(generate.message("dipak"));
		
	}

}
