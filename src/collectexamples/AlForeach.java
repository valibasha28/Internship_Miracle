package collectexamples;

import java.util.*;

public class AlForeach {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("mango");
		al.add("apple");
		al.add("grape");
		al.add("pine");
		al.add("pome");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("\nSize of list is: "+al.size());
		
		System.out.println("\nEnhanced for loop: ");
		for(String item:al) {
			System.out.println(item);
		}
		
		System.out.println("\nUsing Iterator: ");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
