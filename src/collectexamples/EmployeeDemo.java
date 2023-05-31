package collectexamples;

import java.util.*;

class Employee{
	int emp_id;
	String salary;
	String location;
	
	Employee(int emp_id,String salary,String location){
		this.emp_id=emp_id;
		this.salary=salary;
		this.location=location;
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"basha","hyd");
		Employee e2=new Employee(2,"hari","chni");
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		
		ListIterator<Employee> itr=al.listIterator();
		
		while(itr.hasNext()) {
			Employee em = itr.next();
			System.out.println(em.emp_id+" "+em.salary+" "+em.location);
		}
		
		System.out.println("without objects");
		
		/*
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
	
	}

}
