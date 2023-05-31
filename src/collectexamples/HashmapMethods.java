package collectexamples;

import java.util.*;

public class HashmapMethods {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<>();
		
		hm.put(1,"mango");
		hm.put(2,"grapes");
		hm.put(3,"pome");
		hm.put(1,"banana");
		
		for(Map.Entry<Integer,String> item:hm.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
		}
		
		
		Map<Integer,String> hm1=new HashMap<>();
		hm1.put(4,"mango");
		hm1.putAll(hm);
		System.out.println("\nput all");
		for(Map.Entry<Integer,String> item1:hm1.entrySet()) {
			System.out.println(item1.getKey()+" "+item1.getValue());
		}
		
		hm1.remove(4);
		System.out.println("\nafter remove");
		System.out.println(hm1);
		
		hm1.replace(1,"mango");
		System.out.println("\nafter replace");
		System.out.println(hm1);
		

	}

}
