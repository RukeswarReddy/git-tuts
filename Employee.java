package com.jsp;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	String name;
	String designation;
	int id;
	
	
	public String getName() {
		return name;
	}
	
	@Value(value = "Rukesh")
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	
	@Value(value = "HR")
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	@Value(value = "10")
	public void setId(int id) {
		this.id = id;
	}

}
