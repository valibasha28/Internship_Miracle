package i23.task2;

import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		
		double val1=sc.nextDouble();
		double val2=sc.nextDouble();		
		
		System.out.print("Enter the operator: (+,-,*,/,%): ");
		
		char op=sc.next().charAt(0);
		
		double result = 0;
		
		switch(op) {
		
		case '+':
			result=val1 + val2;
			break;
		case '-':
			result=val1 - val2;
			break;
		case '*':
			result=val1 * val2;
			break;
		case '/':
			result=val1 / val2;
			break;
		case '%':
			result=val1 % val2;
			break;
		default:
			System.out.println("Wrong input");
		
		}
		
		System.out.println("Result is: ");
		System.out.println(val1 +" "+ op +" "+val2+" = "+result);
		
		
		
		sc.close();
	}

}
