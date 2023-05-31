package filesexamples;

import java.io.*;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		File f=new File("/home/training/Desktop/files/demo.txt");
		
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}
			
	}

}
