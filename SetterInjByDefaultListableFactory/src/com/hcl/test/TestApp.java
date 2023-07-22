package com.hcl.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.hcl.beans.WishMessage;

public class TestApp {

	public static void main(String[] args) {
	
		
		DefaultListableBeanFactory dbf=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(dbf);
		
		reader.loadBeanDefinitions("com/hcl/config/Config.xml");
		
//		 Object obj=dbf.getBean("wm");
//		WishMessage wm=(WishMessage)obj;

		WishMessage wm=dbf.getBean("wm",WishMessage.class);
		
		String msg=wm.Wish("Dipak");
		
		System.out.print(msg);
	
	}

}
