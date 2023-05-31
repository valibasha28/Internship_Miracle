package collectexamples;

import java.util.*;

public class Mapcomparemethods {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1,"basha");
		m1.put(2, "heri");
		
		Map<Integer,String> m2=new HashMap<>();
		m2.put(1,"anu");
		m2.put(2, "heri");
		
		Map<Integer,String> m3=new HashMap<>();
		m3.put(1,"basha");
		m3.put(2, "heri");
		
		System.out.println("map1 == map2: "+m1.equals(m2));
		System.out.println("map1 == map3: "+m1.equals(m3));
		
		System.out.println("\nmap1 keys == map2 keys: "+(m1.keySet()).equals(m2.keySet()));
		System.out.println("map1 keys == map3 keys: "+(m1.keySet()).equals(m3.keySet()));
		
		Set<String> s1=new HashSet<>(m1.values());
		Set<String> s2=new HashSet<>(m2.values());
		Set<String> s3=new HashSet<>(m3.values());
		
		System.out.println("\nmap1 values == map2 values: "+s1.equals(s2));
		System.out.println("map1 values == map3 values: "+s1.equals(s3));
		
		
	}

}
