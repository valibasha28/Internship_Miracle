package filesexamples;

import java.io.*;
import java.util.*;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileOutputStream fout=new FileOutputStream("/home/training/Desktop/files/demofout.txt");
			
			Scanner sc=new Scanner(System.in);
			System.out.print("enter a string: ");
			String s=sc.nextLine();
			
			byte b[]=s.getBytes();
			
			fout.write(b);
			fout.close();
			
			System.out.println("created file");
			
			sc.close();
		
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		

	}

}
