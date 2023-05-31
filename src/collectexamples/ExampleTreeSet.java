package collectexamples;

import java.util.*;

public class ExampleTreeSet {

	public static void main(String[] args) {
		
		Set hs= new TreeSet();
		
		hs.add(1);
		hs.add(22);
		hs.add(8);
		hs.add(18);
		
		Iterator i=hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
