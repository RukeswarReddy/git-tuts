package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Company {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 //load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		
		//create a statement
		Statement st = con.createStatement();
		
		// execute the query
		st.execute("create database Company");
				
		System.out.println("database created");
				
		//close the connection
		con.close();

	}

}
