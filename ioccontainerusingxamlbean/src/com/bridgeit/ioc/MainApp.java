package com.bridgeit.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MainApp {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));//to create a factory object
		HelloWorld world = (HelloWorld) factory.getBean("HelloWorld");//uses bean ID to return a generic object, which finally can be casted to the actual object
		
		world.getMessage();
	}
}
