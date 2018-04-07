package com.example.rest.webservices.demorestfulwebservice.user;

import java.util.Date;

public class User {
	private Integer number;
	private String name;
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
