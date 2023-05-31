package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee id where you want to make changes");
		int e_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee age");
		int e_age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee role");
		String e_role = sc.nextLine();
		
		System.out.println("Enter the employee phone number");
		String phonenum = sc.nextLine();
		long e_phone=Long.parseLong(phonenum);
		
		sc.close();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps = c.prepareStatement(" update employee set e_age=?,e_role=?,e_phone=? where e_id=? "); 
			
			ps.setInt(1,e_age);
			ps.setString(2, e_role);
			ps.setLong(3, e_phone);
			ps.setInt(4, e_id);
			
			
			int j = ps.executeUpdate();
			
			
			if(j>0)
			{
				System.out.println("Updated");
			}
			else
			{
				System.out.println("Not Updated");
			}
			
			ps.close();
			
			
		} 
		
		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		System.out.println("done");
		
		
	}

}
