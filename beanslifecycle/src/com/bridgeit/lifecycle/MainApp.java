package com.bridgeit.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("HelloWorld");
		obj1.getMessage();
		context.registerShutdownHook();
	}
}
