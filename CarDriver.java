package springcoreXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		
		Car c = (Car)ac.getBean("mycar");
		
		System.out.println(c.getBrand()+" "+c.getPrice());
		
		System.out.println(c.e.getEngid());

	}

}
