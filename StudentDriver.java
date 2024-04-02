package springcoreXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		
		Student s = (Student) ac.getBean("mystudent");
		
		System.out.println(s.id+" "+s.name);
	}
}
