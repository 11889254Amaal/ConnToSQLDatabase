package sqlProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InertToDatabase {
	public static void InsToDatabaseValue () throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbConn";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
			
			//Entering the data
          Scanner scanner = new Scanner(System.in);
	
	        System.out.println("enter name");
	        String name = scanner.next();
	
	        System.out.println("enter roll no");
            Integer roll = scanner.nextInt();
	
	        System.out.println("enter class");
	        String class1 = scanner.next();
	
	        // Inserting data using SQL query
	        String sql = "insert into student values('" + name
                + "'," + roll + ",'" + class1 + "')";
	       
	        Statement st = con.createStatement();
	        //
                    // Executing query
	                    int m = st.executeUpdate(sql);
                    if (m >=  1)
                        System.out.println(
	                                "inserted successfully : " + sql);
                    else
                        System.out.println("insertion failed");
	      
	                    // Closing the connections
                   con.close();
                  
                   
		} else {
			System.out.println("Database Connection failed");
		}
	}
}
