package com.bridgeit.singletonescope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By:Pooja Todkar.
 * Date :09/05/2019.
 * Purpose :implementation of beans using singletone scope.
 * Description : the Spring IoC container creates exactly one 
 * instance of the object defined by that bean definition.
 */

public class MainApp {
	
	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml") ;
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		
		
		obj1.setMessage("hello world");
		obj1.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloworld");
		obj2.getMessage();				
	}
}
