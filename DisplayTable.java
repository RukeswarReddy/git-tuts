package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 //load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
		
		//create a statement
		Statement st = con.createStatement();
		
		// execute query Method
		ResultSet rs = st.executeQuery("select Designation,name,salary  from Employee1");
		
		// process the result
		while(rs.next())
		{
			System.out.println(rs.getString(1)+ "  " + rs.getString(2)+ "  " + rs.getInt(3));
		}
		
		//close the connection
		con.close();

	}

}
