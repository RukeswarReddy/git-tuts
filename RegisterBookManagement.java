package bookManagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/registration")
public class RegisterBookManagement extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		// fetch the user entered values from request
		
		String name = req.getParameter("name");
		
		String dateofbirth = req.getParameter("date");
		
		String address = req.getParameter("address");
		
		String phonenumber = req.getParameter("phone");
		
		String emailid = req.getParameter("email");
		
		String password = req.getParameter("password");
		
		// store the data into database
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bengaluru", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("insert into nagavaram values(?,?,?,?,?,?)");
			
			ps.setString(1,name);
			
			ps.setString(2,dateofbirth);
			
			ps.setString(3,address);
			
			ps.setString(4,phonenumber);
			
			ps.setString(5,emailid);
			
			ps.setString(6,password);
			
			ps.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.forward(req, res);
		
		
		
	}

}
