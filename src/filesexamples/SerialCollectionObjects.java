package filesexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;



class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int price;
	Book(String name,int price){
		this.name=name;
		this.price=price;
	}
}

public class SerialCollectionObjects {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("/home/training/Desktop/files/serial.txt");
			Book b1=new Book("let us C",700);
			Book b2=new Book("OS",1200);
			Book b3=new Book("CN",1700);
			
			List<Object> al = new ArrayList<Object>();
			al.add(b1);
			al.add(b2);
			al.add(b3);
			
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			oos.writeObject(al);
			oos.close();
			fout.close();
			
			System.out.println("converted to byte");
			
			FileInputStream fin=new FileInputStream("/home/training/Desktop/files/serial.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			
			System.out.println("\nconverted to stream");
			
			@SuppressWarnings("unchecked")
			ArrayList<Object> readObject = (ArrayList<Object>)oin.readObject();
			al = readObject;
			
			for(Object o:al) {
				Book b=(Book)o;
				System.out.println(b.name+" "+b.price);
				
			}
			
			oin.close();
			fin.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		

	}

}
