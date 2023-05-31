package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class RetrieveTask2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String e_fname;
		String e_lname;
		String e_username;
		
		System.out.print("Enter the your choice: ");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("1)FN LN UN \n2)FN LN \n3)FN UN \n4)LN UN \n5)FN \n6)LN \n7)UN ");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			switch(choice) {
			case 1:
				
				System.out.println("Enter the employee first name: ");
				e_fname = sc.nextLine();
			
				System.out.println("Enter the employee last name: ");
				e_lname = sc.nextLine();
			
				System.out.println("Enter the employee user name: ");
				e_username = sc.nextLine();
			
				PreparedStatement ps=con.prepareStatement("select * from employee where e_fname=? and e_lname=? and e_username=?");
				ps.setString(1, e_fname);
				ps.setString(2, e_lname);
				ps.setString(3, e_username);
			
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
				
			case 2:
				
				System.out.println("Enter the employee first name: ");
				e_fname = sc.nextLine();
			
				System.out.println("Enter the employee last name: ");
				e_lname = sc.nextLine();
			
				PreparedStatement ps1=con.prepareStatement("select * from employee where e_fname=? and e_lname=?");
				ps1.setString(1, e_fname);
				ps1.setString(2, e_lname);

			
				ResultSet rs1=ps1.executeQuery();
			
				ResultSetMetaData rm1=rs1.getMetaData();
			
				for(int i=1;i<=rm1.getColumnCount();i++) {
					System.out.print(rm1.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs1.next()) {
					for(int i=1;i<=rm1.getColumnCount();i++) {
						System.out.print(rs1.getString(i)+" ");
					}
					System.out.println("\n");
				}
				
			case 3:

				System.out.println("Enter the employee first name: ");
				e_fname = sc.nextLine();
			
				System.out.println("Enter the employee user name: ");
				e_username = sc.nextLine();
			
				PreparedStatement ps2=con.prepareStatement("select * from employee where e_fname=? and e_username=?");
				ps2.setString(1, e_fname);
				ps2.setString(2, e_username);
			
				ResultSet rs2=ps2.executeQuery();
			
				ResultSetMetaData rm2=rs2.getMetaData();
			
				for(int i=1;i<=rm2.getColumnCount();i++) {
					System.out.print(rm2.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs2.next()) {
					for(int i=1;i<=rm2.getColumnCount();i++) {
						System.out.print(rs2.getString(i)+" ");
					}
					System.out.println("\n");
				}
			
			case 4:
				
				System.out.println("Enter the employee last name: ");
				e_lname = sc.nextLine();
			
				System.out.println("Enter the employee user name: ");
				e_username = sc.nextLine();
			
				PreparedStatement ps3=con.prepareStatement("select * from employee where e_lname=? and e_username=?");
				ps3.setString(1, e_lname);
				ps3.setString(2, e_username);
				
				ResultSet rs3=ps3.executeQuery();
			
				ResultSetMetaData rm3=rs3.getMetaData();
			
				for(int i=1;i<=rm3.getColumnCount();i++) {
					System.out.print(rm3.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs3.next()) {
					for(int i=1;i<=rm3.getColumnCount();i++) {
						System.out.print(rs3.getString(i)+" ");
					}
					System.out.println("\n");
				}
				
			case 5:

				System.out.println("Enter the employee first name: ");
				e_fname = sc.nextLine();
			
				PreparedStatement ps4=con.prepareStatement("select * from employee where e_fname=?");
				ps4.setString(1, e_fname);	sc.close();
			
				ResultSet rs4=ps4.executeQuery();
			
				ResultSetMetaData rm4=rs4.getMetaData();
			
				for(int i=1;i<=rm4.getColumnCount();i++) {
					System.out.print(rm4.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs4.next()) {
					for(int i=1;i<=rm4.getColumnCount();i++) {
						System.out.print(rs4.getString(i)+" ");
					}
					System.out.println("\n");
				}
				
			case 6:
			
				System.out.println("Enter the employee last name: ");
				e_lname = sc.nextLine();
			
				PreparedStatement ps5=con.prepareStatement("select * from employee where e_lname=?");
				ps5.setString(1, e_lname);
			
				ResultSet rs5=ps5.executeQuery();
			
				ResultSetMetaData rm5=rs5.getMetaData();
			
				for(int i=1;i<=rm5.getColumnCount();i++) {
					System.out.print(rm5.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs5.next()) {
					for(int i=1;i<=rm5.getColumnCount();i++) {
						System.out.print(rs5.getString(i)+" ");
					}
					System.out.println("\n");
				}
				
			case 7:
				
				System.out.println("Enter the employee user name: ");
				e_username = sc.nextLine();
			
				PreparedStatement ps6=con.prepareStatement("select * from employee where e_username=?");
				ps6.setString(1, e_username);
			
				ResultSet rs6=ps6.executeQuery();
			
				ResultSetMetaData rm6=rs6.getMetaData();
			
				for(int i=1;i<=rm6.getColumnCount();i++) {
					System.out.print(rm6.getColumnName(i)+" ");
				}
			
				System.out.println("\n");
		
				while(rs6.next()) {
					for(int i=1;i<=rm6.getColumnCount();i++) {
						System.out.print(rs6.getString(i)+" ");
					}
					System.out.println("\n");
				}
				
			default:
				System.out.println("Wrong Choice");
			}
			
			
				con.close();
		} 
	
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("done");
		}
		
		sc.close();

	}

}
