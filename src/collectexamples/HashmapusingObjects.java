package collectexamples;

import java.util.*;

class Book{
	String name,author;
	int price;
	
	Book(String name,String author,int price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
}

public class HashmapusingObjects {

	public static void main(String[] args) {
		
		Book b1=new Book("LetusC","Yash",700);
		Book b2=new Book("OS","Galvin",1200);
		
		Map<Integer,Book> hm=new HashMap<Integer,Book>();
		hm.put(1, b1);
		hm.put(2,b2);
		
		for(Map.Entry<Integer,Book> item:hm.entrySet()) {
			Book b=item.getValue();
			System.out.println(item.getKey()+" "+b.name+" "+b.author+" "+b.price);
		}

	}

}
