package collectexamples;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		/*
		Map m=new HashMap();
		m.put(1,"basha");
		m.put(2,"heri");
		m.put(3,"mohan");
		
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry item=(Map.Entry)itr.next();
			System.out.println(item.getKey()+" "+item.getValue());
		}
		*/
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(2,"basha");
		m.put(1,"heri");
		m.put(3,"mohan");
		
		for(Map.Entry item:m.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
		}

	}

}
