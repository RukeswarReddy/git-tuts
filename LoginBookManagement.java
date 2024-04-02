package bookManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Loginhere")
public class LoginBookManagement extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String emailid = req.getParameter("email");
		
		String password = req.getParameter("password");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bengaluru", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("select * from nagavaram where emailid=? and password=?");
			
			ps.setString(1, emailid);
			
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				RequestDispatcher rd = req.getRequestDispatcher("Main.html");
				
				rd.forward(req, res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.print("INCORRECT USERNAME OR PASSWORD....!!");
		
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		
		rd.include(req, res);
		
		
		
		
	}
	

}

