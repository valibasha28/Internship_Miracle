package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class RetrieveTaskEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the employee first name: ");
		String e_fname = sc.nextLine();
		
		System.out.print("Enter the employee last name: ");
		String e_lname = sc.nextLine();
		
		System.out.print("Enter the employee user name: ");
		String e_username = sc.nextLine();
		
		sc.close();
		
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			PreparedStatement ps=con.prepareStatement("select * from employee where e_fname like '"+e_fname+"%' and e_lname like '"+e_lname+"%' and e_username like'"+e_username+"%'");
			
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
	
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("done");
		}

	}

}
