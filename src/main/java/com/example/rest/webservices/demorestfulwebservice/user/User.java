package com.example.rest.webservices.demorestfulwebservice.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	private Integer number;
	
	@Size(min=2, message= "User name should have atleast 2 characters")
	private String name;
	@Past(message= "Date of Birth should be less than current Date")
	private Date dob;
	protected User() {}
	public User(Integer number, String name, Date dob) {
		super();
		this.number = number;
		this.name = name;
		this.dob = dob;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}	
	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", dob=" + dob + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
