package i23.task2;

import java.util.Scanner;

public class Posneg {
	
	public static void main(String []args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Input number: ");
		int number=scn.nextInt();


		
		if(number>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		
		scn.close();
		
	}
	
}
