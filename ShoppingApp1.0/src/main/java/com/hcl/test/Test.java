package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.comp.Amazon;
import com.hcl.comp.Flipkart;
import com.hcl.comp.Shopping;

public class Test {

	public static void main(String[] args) {
		
		Shopping shop;
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hcl/config/config.xml");
//		// get Target class object
//		shop = ctx.getBean("amzn", Amazon.class);
//		// invoke the b.method
//		String result = shop.buy(new String[] 
//				{ "mangoes", "tamarind", "sugar canes" },
//				new float[] { 900.0f, 300.0f, 100.0f });
//		System.out.println(result);

	}

}
