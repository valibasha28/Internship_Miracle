package i23.task2;

import java.util.*;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		int r;
		
		while(num>0) {
			r=num%10;
			sum+=(Math.pow(r, 3));
			num=num/10;
		
		}
		if(temp==sum) {
			System.out.println("The given number is an Armstrong number");
		}
		else {
			System.out.println("The given number is not an Armstrong number");

		}
		
		sc.close();

	}

}