package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
@SuppressWarnings("resource")
public static void main(String[] args) {
   
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   Object obj=context.getBean("hello");
	   System.out.println(obj.toString());
	   
   }  
}