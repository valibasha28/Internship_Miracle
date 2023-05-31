package employeeTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args)
	{
		try {
			//step 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 establish the connection
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","M1racle@123");
			
			//step 3 create statement
			PreparedStatement ps = c.prepareStatement("create table employee (e_id int,e_fname char(20),e_lname char(20),e_age int,e_role char(20),e_phone bigint(15),e_email varchar(20),e_username varchar(20),e_password varchar(20))");
			
			//step 4 execute query 
			ps.execute();
					
			//step 5 close
			ps.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
		
	}
}