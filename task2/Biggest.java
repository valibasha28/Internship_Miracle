package i23.task2;

import java.util.Scanner;

public class Biggest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+" is bigger than "+number2);
		}
		else {
			System.out.println(number2+" is bigger than "+number1);
		}
		
		sc.close();
		
	}
	
}
