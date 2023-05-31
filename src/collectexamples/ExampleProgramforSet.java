package collectexamples;

import java.util.*;

public class ExampleProgramforSet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter how many data items you want: ");
		int num=sc.nextInt();
		
		Set s=new HashSet();
		
		for(int i=0;i<num;i++) {
			System.out.println("enter data items: ");
			int data=sc.nextInt();
			s.add(data);
		}
		
		
		/*
		s.add(1);
		s.add("ABC");
		s.add(52);
		s.add('c');
		s.add(52);
		*/
		
		Iterator i=s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		sc.close();

	}

}
