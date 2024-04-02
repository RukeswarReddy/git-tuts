package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDesignation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Establish connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
				
				//create a statement
				Statement st = con.createStatement();
				
				// execute the query
				st.execute("delete from Employee1 where Designation ='web Driver'");
				
				System.out.println("Values Deleted");
				
				// close the connection
				
				con.close();


	}

}
