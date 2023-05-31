package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DmlDelete{

	public static void main(String[] args) {
		
		
		try {
			// Step - 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step - 2
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			//step - 3
			
			PreparedStatement ps = c.prepareStatement("Delete from student where student_id = 4");
			int j = ps.executeUpdate();
			if(j> 0)
			{
				System.out.println("Deletion Done");
			}
			else
			{
				System.out.println("not printed");
			}
			
			
			System.out.println("Done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
