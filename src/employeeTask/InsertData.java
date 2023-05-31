package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the EMPLOYEE details:");
		
		System.out.println("Enter the employee id");
		int e_id = sc.nextInt();
		sc.nextLine();
	
        System.out.println("Enter the employee first name");
		String e_fname = sc.nextLine();
		e_fname.toLowerCase();
		
		System.out.println("Enter the employee last name");
		String e_lname = sc.nextLine();
		e_lname.toLowerCase();
		
		System.out.println("Enter the employee age");
		int e_age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee role");
		String e_role = sc.nextLine();
		
		System.out.println("Enter the employee phone number");
		String phnum = sc.nextLine();
		long e_phone = Long.parseLong(phnum);
		
		String e_email = e_fname.substring(0,1).toLowerCase()+e_lname.toLowerCase()+"@intern.com";
		String e_username = e_fname.substring(0,1).toLowerCase()+e_lname.toLowerCase();
		String e_password = e_fname.substring(0,1).toLowerCase()+e_lname.substring(0,2).toLowerCase()+phnum.substring(5);
		
		sc.close();
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps = c.prepareStatement("Insert into employee values(?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, e_id);
			ps.setString(2,e_fname);
			ps.setString(3,e_lname);
			ps.setInt(4, e_age);
			ps.setString(5,e_role);
			ps.setLong(6,e_phone);
			ps.setString(7,e_email);
			ps.setString(8,e_username);
			ps.setString(9,e_password);
			
			int j = ps.executeUpdate();
			
			if(j > 0)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Not Inserted");
			}
			
			ps.close();
			
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");

	}

}
