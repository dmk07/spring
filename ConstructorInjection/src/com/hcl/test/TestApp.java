package com.hcl.test;
	import org.springframework.beans.factory.BeanFactory;  
	import org.springframework.beans.factory.xml.XmlBeanFactory;  
	import org.springframework.core.io.*;

import com.hcl.beans.Employee;  
	  
	public class TestApp {  
	    public static void main(String[] args) {  
	          
	    	FileSystemResource file=new FileSystemResource("src/com/hcl/config/Applicationconfig.xml");
	    	 BeanFactory factory=new XmlBeanFactory(file);  
	          
	        Employee s=(Employee)factory.getBean("e");  
	        s.show();  
	          
	    }  
	}  


