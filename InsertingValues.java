package second_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Establish connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/andhra", "root", "root");
				
				//create a statement
				Statement st = con.createStatement();
				
				// execute the query
				st.execute("insert into kadapa values(2,'seetha',22)");
				st.execute("insert into kadapa values(3,'Rama',23)");
				st.execute("insert into kadapa values(4,'Hanuman',32)");
				
				
				System.out.println("inserted the values");
				
				
				con.close();

			}

		


	}


