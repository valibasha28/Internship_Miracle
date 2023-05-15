package i23.task2;

import java.util.*;

public class NoOfOccurences {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		
		System.out.print("Enter the digit to check how many times occur in the number:");
		int digit=sc.nextInt();
		
		int r;
		int count=0;
		
		while(num>0) {
			r=num%10;
			if(r==digit) {
				count++;
			}
			num=num/10;
		}
		
		System.out.println("The digit "+digit+" no of times occured is:"+count);
		
		sc.close();

	}

}