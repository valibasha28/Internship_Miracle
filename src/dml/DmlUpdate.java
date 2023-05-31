package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DmlUpdate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id you want to change:");
		int sid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter student name: ");
		String sname=sc.nextLine();
		
		System.out.println("enter student marks:");
		int smarks=sc.nextInt();
		
		sc.close();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps=con.prepareStatement("update student set student_name=?,student_marks=? where student_id=?");
			
			ps.setString(1,sname);
			ps.setInt(2, smarks);
			ps.setInt(3, sid);
			
			ps.executeUpdate();
			
			ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
		

	}

}
