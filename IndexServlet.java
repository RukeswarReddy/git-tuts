package Servlet_Demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/index")
public class IndexServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("myname");
		
		String address = req.getParameter("address");
		
		System.out.println("name : "+name);
		
		System.out.println("address :"+address);
		
		
	}

	

}
