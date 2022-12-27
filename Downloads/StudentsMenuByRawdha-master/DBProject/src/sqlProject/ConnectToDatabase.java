package sqlProject;
//Importing database

import java.sql.*;
import java.util.*;

//import java.sql.DriverManager;

		// Importing required classes
import java.util.*;
public class ConnectToDatabase {

	public static void conToData () throws ClassNotFoundException, SQLException{
		
	
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbConn";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
			
			//Entering the data
          
                 
                  
                   
		} else {
			System.out.println("Database Connection failed");
		}
	}	
	


		
		    

}
