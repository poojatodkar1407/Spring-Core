package com.bridgeit.autowiring;

public class A {
	B b;

	public A() {
		System.out.println("A is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void print() {
		System.out.println("hello A");
	}

	public void display() {
		print();
		b.print();
	}
}
