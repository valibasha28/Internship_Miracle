package collectexamples;

import java.util.*;

public class LinkListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> al=new LinkedList<Integer>();
		
		for(int i=0;i<5;i++) {
			al.add(i);
		}
		System.out.println("list 1 is: "+al);
		
		LinkedList<Integer> al1=new LinkedList<Integer>();
        al1.add(1);
        al1.add(3);
        al1.add(26);
        System.out.println("list 2 is: "+al1);
		
		al.add(2,57);
		System.out.println("after add: "+al);
			
		al.set(3,26);
		System.out.println("after set :"+al);
        
        int element = al.get(4);
        System.out.println("get method: "+element);
        
        System.out.println("Size is: "+al.size());
        
        al.remove(2);
        System.out.println("after remove : "+al);
        
        System.out.println("list 1 is: "+al);
        System.out.println("list 2 is: "+al1);
        
        al.removeAll(al1);
        System.out.println("after remove all : "+al);
        
        al.addAll(al1);
        System.out.println("after add all : "+al);
        
        al.retainAll(al1);
        System.out.println("after retain all : "+al);
        
        al.clear();
        System.out.println("clear : "+al+ " "+al1);
        
        System.out.println(al1.contains(3));
        
        System.out.println(al1.isEmpty());
        
        System.out.println(al.isEmpty());
		
		

	}

}
