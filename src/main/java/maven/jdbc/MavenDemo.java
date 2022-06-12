package maven.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class MavenDemo {

	public static void main(String[] args) {
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String uname = "root";
			String pass = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
					
			String query1 = "Select * from students";
			 ResultSet rs = st.executeQuery(query1);
			 
			while( rs.next()) {
				
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
			}
			 con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
