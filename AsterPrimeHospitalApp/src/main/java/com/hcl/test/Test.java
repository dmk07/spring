package com.hcl.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.hcl.controller.Controller;
import com.hcl.vo.PatientVO;

public class Test {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Patient Name:");
		String name=scn.next();
		System.out.println("Enter Patient Address:");
		String addr=scn.next();
		System.out.println("Enter Patient Mobile:");
		String mobile=scn.next();
		System.out.println("Enter Patient Days:");
		String days =scn.next();
		System.out.println("Enter Patient Bill per Day:");
		String dailybill=scn.next();
		
		PatientVO vo=new PatientVO();
		
		vo.setPatientName(name);
		vo.setPatientAddr(addr);
		vo.setPatientMobile(mobile);
		vo.setPatientDays(days);
		vo.setPatientBillPerDay(dailybill);
		
		
		DefaultListableBeanFactory bf=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(bf);
		
		reader.loadBeanDefinitions("com/hcl/config/config.xml");
		
		Controller main=bf.getBean("control",Controller.class);
		
		try {
			String result=main.processBillAmount(vo);
			System.out.println(result);
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		
		
	}

}
