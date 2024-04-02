package com.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeDriver {
	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Employee.class);
		
		Employee e = (Employee)ac.getBean("employee");
		
		System.out.println(e.getId()+"  "+e.getName()+"  "+e.getDesignation());

	}

}
