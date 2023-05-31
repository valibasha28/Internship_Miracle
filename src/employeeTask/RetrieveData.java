package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class RetrieveData {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rm=rs.getMetaData();	
			
			for(int i=1;i<=rm.getColumnCount();i++) {
				System.out.print(rm.getColumnName(i)+" ");
			}
			
			System.out.println("\n");
		
			
			while(rs.next()) {
				for(int i=1;i<=rm.getColumnCount();i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println("\n");
			}
			
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

