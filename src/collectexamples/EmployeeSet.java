package collectexamples;

import java.util.*;

class Employ {
	int emp_id;
	String salary;
	String location;
	
	Employ(int emp_id,String salary,String location){
		this.emp_id=emp_id;
		this.salary=salary;
		this.location=location;
	}
}


public class EmployeeSet {

	public static void main(String[] args) {
		
		Employ e1=new Employ(1,"basha","hyd");
		Employ e2=new Employ(2,"hari","chni");
		
		Set<Employ> s=new HashSet<Employ>();
		s.add(e1);
		s.add(e2);
		
		Iterator<Employ> itr=s.iterator();
		
		while(itr.hasNext()) {
			Employ em = itr.next();
			System.out.println(em.emp_id+" "+em.salary+" "+em.location);
		}
		
		
	}

}
