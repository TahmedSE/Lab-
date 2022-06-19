package com.Model;

public class Employee {

	String Firstname;
	String Lastname;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
		
	}

	public Employee(String Firstname, String Lastname) {
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}
	
	}
