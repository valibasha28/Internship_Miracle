package i23.task2;


import java.util.*;

public class FirstAndLast {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the number :");
    	int num=sc.nextInt();
    	
    	int f=num%10;
    	
    	while(num>=10) {
    		num=num/10;
    	}
    	
    	int l=num%10;
    	
    	System.out.println("The sum of first and last digit is:"+(f+l));
    	
    	sc.close();
    }
}