package collectexamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Students{
	int id;
	String name;
	int marks;
	
	Students(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

public class StudentList {

	public static void main(String[] args) {
		Students s1=new Students(1,"basha",98);
		Students s2=new Students(2,"heri",96);
		Students s3=new Students(3,"anand",94);
		
		List<Students> l=new LinkedList<Students>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		Iterator<Students> itr=l.iterator();
		
		while(itr.hasNext()) {
			Students st=itr.next();
			System.out.println(st.id+" "+st.name+" "+st.marks);
		}
		
		

	}

}
