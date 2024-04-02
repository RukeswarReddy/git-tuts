package com.jsp;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	
	String name ;
	int age;
	
	public Person(@Value(value = "Rukesh")String name, @Value(value = "22")int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	

}
