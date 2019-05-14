package com.bridgeit.prototypescope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("HelloWorld");
		
		obj1.setMessage("hello bridgelabz");
		obj1.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("HelloWorld");
		obj2.getMessage();
	}

}
