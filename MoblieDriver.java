package com.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MoblieDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Moblie m = (Moblie)ac.getBean("moblie");
		
		m.display();
		
		m.s.text();

	}

}
