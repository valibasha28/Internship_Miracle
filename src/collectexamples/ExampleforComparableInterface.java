package collectexamples;

import java.util.*;

class StuDemo implements Comparable<StuDemo>{
	int id;
	String name;
	int age;
	
	StuDemo(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int compareTo(StuDemo st) {
		if(age==st.age) {
			return 0;
		}
		else if(age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}


public class ExampleforComparableInterface {

	public static void main(String[] args) {
		
		ArrayList<StuDemo> al=new ArrayList<StuDemo>();
		
		al.add(new StuDemo(1,"basha",21));
		al.add(new StuDemo(2,"mohan",20));
		al.add(new StuDemo(3,"heri",22));
		
		Collections.sort(al);
		
		for(StuDemo s:al) {
			System.out.println(s.age+" "+s.id+" "+s.name);
		}
		

	}

}
