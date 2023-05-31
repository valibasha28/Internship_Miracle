package filesexamples;

import java.io.*;
import java.util.*;

public class BufferedOSExample {
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fout=new FileOutputStream("/home/training/Desktop/files/demobout.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			
			Scanner sc=new Scanner(System.in);
			System.out.print("enter a string: ");
			String s=sc.nextLine();
			
			byte b[]=s.getBytes();
			
			bout.write(b);
			bout.flush();
			
			bout.close();
			fout.close();
			
			System.out.println("created file");
			
			sc.close();
		
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
