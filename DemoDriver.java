package com.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Demo d = (Demo)ac.getBean("demo");
		
		d.test();

	}

}
