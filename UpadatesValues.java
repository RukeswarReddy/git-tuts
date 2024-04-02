package first_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadatesValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		
		//create a statement
		Statement st = con.createStatement();
		
		// execute the query
		st.execute("update student set name = 'Mahesh' where id = 3");
		
		System.out.println("Updated");
		
		//close the connection
		con.close();

	}

}
