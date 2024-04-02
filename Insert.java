package dynamicReading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  // load and register
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  //establish connection
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "root");
	  
	  //create a statement
	  //create a dynamic query with place holder
	  PreparedStatement ps = con.prepareStatement("insert into subject values(?,?,?)");
	  
	  //take input from the user
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the course ??");
	  String course = sc.next();
	  System.out.println("enter the fees ??");
	  int fees = sc.nextInt();
	  System.out.println("enter the id ??");
	  int id = sc.nextInt();
	  
	  //set the user entered values in place of place holders
	  
	  ps.setString(1, course);
	  ps.setInt(2, fees);
	  ps.setInt(3, id);
	  
	  //execute the query
	  ps.executeUpdate();
	  
	  //close
	  con.close();
	  

	}

}
