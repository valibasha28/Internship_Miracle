package i23.task2;

import java.util.*;

public class BigDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int r;
		int max=0;
		
		while(num>0) {
			r=num%10;
			if(r>max) {
				max=r;
			}
			num=num/10;
		}
		
		System.out.println("The greatest digit in the number is: "+max);
		
		sc.close();

	}

}