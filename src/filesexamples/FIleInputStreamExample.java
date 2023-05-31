package filesexamples;

import java.io.*;

public class FIleInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		try {
			
			FileInputStream fin = new FileInputStream("/home/training/Desktop/files/demofout.txt");
			
			int i=0;
			
			while((i=fin.read()) != -1) {
				System.out.print((char)i);
			}
			
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
