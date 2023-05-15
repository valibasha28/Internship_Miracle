package i23.task2;


import java.util.*;

public class FiboSeries {
	
	static void fib(int n) {
		int f1=0;
    	int f2=1;
    	int f;
    	
    	System.out.println("The series is: ");
    	System.out.print(f1+" "+f2+" ");
    	
    	for(int i=2;i<=n;i++) {
    		f=f1+f2;
    		f1=f2;
    		f2=f;
    		System.out.print(f+" ");
    	}
    	
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		
		int n=sc.nextInt();
		
		fib(n);
		
		sc.close();
	}

}