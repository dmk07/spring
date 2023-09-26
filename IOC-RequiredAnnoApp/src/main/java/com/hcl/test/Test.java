package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.beans.Robot;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("com/hcl/config/config.xml");

		Robot robo1= cx.getBean("com.hcl.beans.Robot#1", Robot.class);
		Robot robo2= cx.getBean("com.hcl.beans.Robot#2", Robot.class);

		//#n index based ranking
		
		System.out.println(robo1);
		System.out.println(robo2);

	}

}
