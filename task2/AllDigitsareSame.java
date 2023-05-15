package i23.task2;

import java.util.*;

public class AllDigitsareSame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int r;
		int temp=num%10;
		int count=0;
		
		while(num>0) {
			r=num%10;
			if(temp!=r) {
				count=1;
				break;
			}
			num=num/10;
		}
		
		if(count==0) {
			System.out.println("The digits all are same in the given number");
		}
		else {
			System.out.println("The digits all are not same in the given number");
		}
		
		sc.close();	
	}

}