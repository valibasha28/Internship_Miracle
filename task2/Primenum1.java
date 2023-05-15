package i23.task2;

import java.util.Scanner;

public class Primenum1 {
	
	public static void main(String []args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Input a number: ");
		int value=scn.nextInt();
		
		int counter=0;
		for(int i=1;i<value;i++) {
			if(value%i == 0) {
				counter++;
			}
		}
		if(counter==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Non prime number");
		}
		
		scn.close();
		
	}

}