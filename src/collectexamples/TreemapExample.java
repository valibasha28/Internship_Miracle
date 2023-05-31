package collectexamples;

import java.util.*;

public class TreemapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new TreeMap<>();
		
		hm.put(1,"mango");
		hm.put(2,"grapes");
		hm.put(3,"pome");
		hm.put(1,"banana");
		hm.put(4,"mango");
		
		for(Map.Entry<Integer,String> item:hm.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
		}
		
	}
	
}
