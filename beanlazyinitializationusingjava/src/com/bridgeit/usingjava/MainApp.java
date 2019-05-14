package com.bridgeit.usingjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Abean bean = (Abean) context.getBean(Abean.class);
		
	}
}
