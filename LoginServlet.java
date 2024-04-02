package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Login")
public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		if(username.equals("java"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Home.html");
			rd.forward(req, res);
			
		}
		
		else
		{
			
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.print("INCORRECT USERNAME....!!!");
			
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
			
		}
		
	}



}
