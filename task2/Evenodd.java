package i23.task2;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String []args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Input a number: ");
		int num=scn.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		scn.close();
	}

}
