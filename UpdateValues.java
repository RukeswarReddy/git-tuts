package dynamicPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // load and register
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //establish connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vizag", "root", "root");
		  
		  //create a statement
		  //create a dynamic query with place holder
		  PreparedStatement ps = con.prepareStatement("update employee set designation =? where name=?");
		  
		  //take input from the user
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the designation ??");
		  String designation  = sc.next();
		  System.out.println("enter the name ??");
		  String name = sc.next();
		  
		  
		  
		//set the user entered values in place of place holders
		  
		  ps.setString(1, designation );
		  ps.setString(2, name);
		  
		  System.out.println("updated");
		 
		 
		  
		  
		  //execute the query
		  ps.executeUpdate();
		  
		  //close
		  con.close();

	}

}
