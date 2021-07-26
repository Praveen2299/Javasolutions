package com.oops;

public class Address {
	private String add1;
	private String add2;
	private String city;
	private int pin;
	
	
	public Address(String add1, String add2, String city, int pin) {
		super();
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.pin = pin;
	}


	public Address(Object object) {
		// TODO Auto-generated constructor stub
	}


	public String getAdd1() {
		return add1;
	}


	public void setAdd1(String add1) {
		this.add1 = add1;
	}


	public String getAdd2() {
		return add2;
	}


	public void setAdd2(String add2) {
		this.add2 = add2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}

	

}
