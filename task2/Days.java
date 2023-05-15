package i23.task2;

import java.util.*;

public class Days {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		System.out.println("1)jan 2)feb 3)march 4)april 5)may 6)june\n"
				+ "7)july 8)aug 9)sept 10)oct 11)nov 12)dec");
		
		int month=sc.nextInt();
		
		if(month>=1 && month<=12) {
			
			if(month==2) {
				System.out.println("No of days in a month is:28");
			}
			
			else if(month==4 || month==6 || month==8 || month==9) {
				System.out.println("Number of days in a month is:30");
			}
			else {
				System.out.println("Number of days in a month is:31");
			}
		}
		
		else {
			System.out.println("Please enter the correct month");
		}
		
		sc.close();
		
	}
}