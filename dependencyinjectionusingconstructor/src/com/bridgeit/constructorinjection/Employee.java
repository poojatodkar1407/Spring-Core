package com.bridgeit.constructorinjection;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
	System.out.println("In the default constructor");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("number is "+id+" name is "+name);
	}
	
}
