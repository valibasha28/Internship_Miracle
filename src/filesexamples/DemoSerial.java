package filesexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class DemoSerial {
	
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream fout=new FileOutputStream("/home/training/Desktop/files/demoserial.txt");
			Emp e1=new Emp(1,"basha");
			
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(e1);
			oos.close();
			fout.close();
			
			System.out.println("converted to byte");
			
			FileInputStream fin=new FileInputStream("/home/training/Desktop/files/demoserial.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Emp e2=(Emp)oin.readObject();
			
			System.out.println("\nconverted to stream");
			System.out.println(e2.id+ " "+e2.name);
			
			oin.close();
			fin.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
