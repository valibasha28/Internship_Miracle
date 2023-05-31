package filesexamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedISExample {
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			FileInputStream fin = new FileInputStream("/home/training/Desktop/files/demobout.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			int i=0;
			
			while((i=bin.read()) != -1) {
				System.out.print((char)i);
			}
			
			bin.close();
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
