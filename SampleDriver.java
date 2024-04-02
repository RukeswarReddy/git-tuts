package springcoreXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleDriver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		
		Sample s = (Sample)ac.getBean("mysample");
		
		s.display();

	}

}
