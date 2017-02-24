package com.java8.features;

public class Employee {

	private int id;
	private String name;
	private String address;
	private String details;
	
	
	public Employee(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
