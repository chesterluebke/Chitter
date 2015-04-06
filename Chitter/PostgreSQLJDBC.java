package Chitter;

import java.sql.*;

public class PostgreSQLJDBC {
	
	public PostgreSQLJDBC() {
		//Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         conn = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/chitterdb", "chitter", "chitter");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
	
	public void insert(String sql) {
		
		
		try {
			Statement st;
			st = conn.createStatement();
			System.out.println(sql);
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
/*	
	
	   public static void main(String args[]) {
	      Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/chitterdb", "chitter", "chitter");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	      
	      try {
	      Statement st = c.createStatement();
	      ResultSet rs = st.executeQuery("SELECT name, population FROM country WHERE continent = 'North America'");
	      while (rs.next()) {
	          System.out.print("Column 1 returned ");
	          System.out.println(rs.getString(1) + " " + rs.getString(2));
	      }
	      rs.close();
	      st.close();
	      }catch (Exception e) {
		         e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
	      }
*/
	private Connection conn;
	
}
	
