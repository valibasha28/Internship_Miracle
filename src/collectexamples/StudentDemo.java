package collectexamples;

import java.util.*;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}

public class StudentDemo {
	public static void main(String[] args) {
		
		Student s1=new Student(1,"Arjun");
		Student s2=new Student(2,"Krish");
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		
		/*
		Iterator i=al.iterator();
		
		while(i.hasNext()) {
			Student st=(Student)i.next();
			System.out.println(st.id+" "+st.name);
		}
		*/
		
		Iterator<Student> i=al.iterator();
		
		while(i.hasNext()) {
			Student st=i.next();
			System.out.println(st.id+" "+st.name);
		}
		
	}

}
