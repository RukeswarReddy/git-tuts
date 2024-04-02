package first_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		
		//create a statement
		Statement st = con.createStatement();
		
		// execute the query
		st.execute("delete from student where id=4");
		
		System.out.println("Values Deleted");
		
		// close the connection
		
		con.close();

	}

}
