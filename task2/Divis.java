package i23.task2;

import java.util.Scanner;

public class Divis {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		
		if((number%3==0) &&(number%5==0)) {
			System.out.println(number+" is divisible");
		}
		else {
			System.out.println(number+" is not divisible");			
		}
		sc.close();
		
	}

}
