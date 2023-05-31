package collectexamples;

import java.util.*;

public class SetOperations {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<5;i++) {
			s.add(i);
		}
		System.out.println("set 1 is: "+s);
		
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(1);
		s1.add(3);
		s1.add(27);
		System.out.println("set 2 is: "+s1);
	
        System.out.println("Size is: "+s.size());
        
        s.remove(4);
        System.out.println("set 1 is: "+s);
        
        s.removeAll(s1);
        System.out.println("after remove all set 1 is: "+s);
        
        s.addAll(s1);
        System.out.println("after add all set 1 is: "+s);
        
        s.retainAll(s1);
        System.out.println("after retain all set 1 is: "+s);
        
        System.out.println("set 1 is: "+s);
        System.out.println("set 2 is: "+s1);
        
        System.out.println("set 1 contains 27 is: "+s.contains(27));
        
        System.out.println("both sets same: "+s.containsAll(s1));
        
        System.out.println("both sets equal: "+s.equals(s1));
        
        System.out.println("hashcode for set s: "+s1.hashCode());
        
        s.clear();
        System.out.println("clear: "+s+" "+s1);
        

	}

}
