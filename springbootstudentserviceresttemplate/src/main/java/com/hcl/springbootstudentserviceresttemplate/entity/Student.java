package com.hcl.springbootstudentserviceresttemplate.entity;

public class Student {
	
	private Long id;
	
	/* private String firstName; */
	
	private String name;
	
	private String address;

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
