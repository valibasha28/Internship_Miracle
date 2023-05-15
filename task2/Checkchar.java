package i23.task2;

import java.util.Scanner;

public class Checkchar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a character : ");
		char c = sc.next().charAt(0);
		int n = c;
		
		if(c >=65 && c <=90) {
			System.out.println("Uppercase");
		}
		else if(c >= 97 && c <=122 ) {
			System.out.println("Lowercase");
		}	
		else if(c >=48 && c <= 57) {
			System.out.println("Digit");
		}	
		else {
			System.out.println("Special Character");
		}
		
		System.out.println("ASCII value : "+n);
			
		sc.close();
	}
}