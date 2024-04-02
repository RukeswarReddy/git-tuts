package dynamicReading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // load and register
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //establish connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "root");
		  
		  //create a statement
		  //create a dynamic query with place holder
		  PreparedStatement ps = con.prepareStatement("update subject set fees=? where course=?");
		  
		  //take input from the user
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the fees ??");
		  int fees = sc.nextInt();
		  System.out.println("enter the course ??");
		  String course = sc.next();
		  
		  
		  
		//set the user entered values in place of place holders
		  
		  ps.setInt(1, fees);
		  ps.setString(2, course);
		 
		 
		  
		  
		  //execute the query
		  ps.executeUpdate();
		  
		  //close
		  con.close();
		  
		  
		  
		  
		
		  

	}

}
