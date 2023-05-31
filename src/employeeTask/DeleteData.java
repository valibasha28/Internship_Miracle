package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the emp id whom data you want to remove");
		int e_id=sc.nextInt();
		
		sc.close();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps=c.prepareStatement("delete from employee where e_id=?");
			
			ps.setInt(1, e_id);
			
			ps.executeUpdate();
			
			System.out.println("deleted");
			
			ps.close();
			
			
		}
		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
