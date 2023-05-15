package i23.task2;

import java.util.Scanner;

public class NprimeNum {
	
	static boolean isPrime(int n){
		
        if(n==1||n==0)
        	return false;
        
        for(int i=2; i<=n/2; i++){
        	if(n%i==0)
        		return false;
        }
        
        return true;
        
	}
	
	public static void main(String []args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Input a number: ");
		int value=scn.nextInt();
		
		for(int i=1; i<=value; i++){
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
		scn.close();
	 }
}
