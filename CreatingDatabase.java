package second_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		
		// create a statement
		Statement st = con.createStatement();
		
		// execute the query
		st.execute("create database andhra");
		
		System.out.println("database created");
		
		//close the connection
		con.close();

	}

}
