package com.bridgeit.injection;

public class Address {

	private String city;
	private String country;
	private String state;

	public Address(String city, String country, String state) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
	}

	@Override
	public String toString() {
		
		System.out.println("Adress [city=" + city + ", country=" + country + ", state=" + state + "]");
		return null;
	}

}
