package com.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Person.class);
		
		Person p = (Person)ac.getBean("person");
		
		System.out.println(p.age+" "+p.name);
	}

}
