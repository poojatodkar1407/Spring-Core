package com.bridgeit.valueannotation;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
	String name;
	String domain;
	
	@Value("Jaspreet")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("Java")
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public void displayTeacherInfo()
	{
		System.out.println("Teacher Name---"+name);
		System.out.println("Teacher Hobby---"+ domain);
		
	}

}
