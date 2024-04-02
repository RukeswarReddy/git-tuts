package Servlet_Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/index2")
public class IndexServlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("myname");
		
		String address = req.getParameter("address");
		
		String phoneNo = req.getParameter("phoneNo");
		
		String age = req.getParameter("age");
		
		PrintWriter pw = res.getWriter();
		
		pw.print("welcome....Name :"+name);
		
		pw.print("  Address :"+address);
		
		pw.print("   Phone No :"+phoneNo);
		
		pw.print(" age  :"+age);
		
		
//		
//		System.out.println("name : "+name);
//		
//		System.out.println("address :"+address);
//		
//		System.out.println("phoneNo :"+ phoneNo);
//		
//		System.out.println("age : "+age);
		
		
	}

	

}

