package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Amazon;
import com.nt.comp.Flipkart;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hcl/config/config.xml");
		// get Target class object
		Amazon fpkt = ctx.getBean("amzn",Amazon.class);
		// invoke the b.method
		String result = fpkt.shopping(new String[] { "mangoes", "tamarind", "sugar canes" },
				new float[] { 900.0f, 300.0f, 100.0f });
		System.out.println(result);

	}

}
