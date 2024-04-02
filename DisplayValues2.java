package second_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayValues2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 //load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/andhra", "root", "root");
		
		//create a statement
		Statement st = con.createStatement();
		
		// execute query Method
		ResultSet rs = st.executeQuery("select * from kadapa where AGE>=23");
		
		// process the result
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " " + rs.getInt(3));
		}
		
		// close the connection
		con.close();
					

	}

}
