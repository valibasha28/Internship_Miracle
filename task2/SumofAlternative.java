package i23.task2;

import java.util.*;

public class SumofAlternative {
	
	int count(int num) {
		int c=0;
    	while(num>0) {
    		c++;
    		num=num/10;
    	}
    	return c;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		SumofAlternative s=new SumofAlternative();
		int c=s.count(num);
		int sum=0;
		int r;
		
		while(num>0) {
			r=num%10;
			if(c%2!=0) {
				sum=sum+r;
			}
			c++;
			num=num/10;
		}
		
		System.out.println("The sum of alternative numbers is:"+sum);
		
		sc.close();
	}

}