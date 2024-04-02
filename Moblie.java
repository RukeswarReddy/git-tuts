package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Moblie {
	@Autowired
	Sim s;
	
	public void display()
	{
		System.out.println("Moblie is working");
	}

}
