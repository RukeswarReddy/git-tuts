package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDesignation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Establish connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
				
				//create a statement
				Statement st = con.createStatement();
				
				// execute the query
				st.execute("update Employee1 set Designation = 'Manager' where salary>15000");
				
				
				System.out.println("updated");
				
				
				con.close();

	}

}
