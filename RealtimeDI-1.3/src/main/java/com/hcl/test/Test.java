package com.hcl.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.config.AppConfig;
import com.hcl.controller.MainController;
import com.hcl.vo.CustomerVO;

public class Test {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter cust name");
		String name=scn.next();
		System.out.println("Enter cust address");
		String addr=scn.next();
		System.out.println("Enter cust principle amount");
		String pamout=scn.next();
		System.out.println("Enter Rate of interest");
		String rate =scn.next();
		System.out.println("Enter Time of intrest");
		String time=scn.next();
		
		CustomerVO vo=new CustomerVO();
		
		vo.setCustName(name);
		vo.setCustaddrs(addr);
		vo.setPamt(pamout);
		vo.setRate(rate);
		vo.setTime(time);
		
		
//		ClassPathXmlApplicationContext ctx=new 
//				ClassPathXmlApplicationContext("com/hcl/config/config.xml");
//		
		
		AnnotationConfigApplicationContext ctx=new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		MainController main=ctx.getBean("controller",MainController.class);
		
		try {
			String result=main.processCustomer(vo);
			System.out.println(result);
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		
		
	}

}
