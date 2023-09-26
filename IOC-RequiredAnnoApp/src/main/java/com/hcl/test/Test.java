package com.hcl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.beans.Robot;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("com/hcl/config/config.xml");

		Robot robo = cx.getBean("robo", Robot.class);

		System.out.print(robo);

	}

}
