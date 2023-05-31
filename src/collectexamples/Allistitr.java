package collectexamples;

import java.util.*;

public class Allistitr {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("basha");
		al.add("arun");
		al.add("krish");
		
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("\nPrevious method");	
		while(itr.hasPrevious()) {		
			System.out.println(itr.previous());		
		}
		
		System.out.println("\nRemove method");
		itr.remove();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
