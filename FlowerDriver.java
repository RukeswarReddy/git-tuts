package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlowerDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Flower f = (Flower)ac.getBean("flower");
		System.out.println(f);
		
		Flower f1 = (Flower)ac.getBean("flower");
		System.out.println(f1);
		
		

	}

}
