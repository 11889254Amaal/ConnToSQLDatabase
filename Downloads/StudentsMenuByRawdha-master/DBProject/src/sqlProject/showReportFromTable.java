package sqlProject;

import java.sql.DriverManager;
import java.util.HashMap;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class showReportFromTable {
	public static void showTable () {
		
	       Connection con = null;
	       Statement statement = null;
	      
	        java.sql.PreparedStatement p = null;
	        ResultSet rs = null;
	 
	      
	      try {
	    	  
	    	 
	         HashMap hm = new HashMap<>();
	         Class.forName("com.mysql.jdbc.Driver");
	         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbConn", "root", "root");
	         statement = (Statement) con.createStatement();
	         String sql;
	         sql = "select *from student";
	         ResultSet resultSet = (ResultSet) statement.executeQuery(sql);
	         while (resultSet.next()) {
	         hm.put(resultSet.getString("name"), resultSet.getInt("roll"));
	         
	         
	         p = con.prepareStatement(sql);
	            
	 
	            // Printing ID, name, email of customers
	            // of the SQL command above
	            System.out.println("name\t\troll\t\tcell");
	            System.out.println("****************************");
	            // Condition check
	            while (resultSet.next()) {
	 
	                String name = resultSet.getString("name");
	                int roll = resultSet.getInt("roll");
	                String cell = resultSet.getString("class1");
	                System.out.println(name + "\t\t" + roll
	                                   + "\t\t" + cell);
	            }
	        }
	      

	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
	}
}
