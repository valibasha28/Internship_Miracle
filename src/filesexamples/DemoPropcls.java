package filesexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class DemoPropcls {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			FileOutputStream fout=new FileOutputStream("/home/training/Desktop/files/demoprop.properties");
			Properties p=new Properties();
			
			p.setProperty("name","basha");
			p.setProperty("email","basha@gmail.com");
			
			p.store(fout, null);
			
			fout.close();
			
			FileInputStream fin = new FileInputStream("/home/training/Desktop/files/demoprop.properties");
			p.load(fin);
			System.out.println(p.getProperty("name"));
			
			fin.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
