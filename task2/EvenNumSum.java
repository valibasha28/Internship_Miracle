package i23.task2;


import java.util.Scanner;

public class EvenNumSum {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of n: ");
		
		int num=sc.nextInt();
		
		int count = 0;
		
		for(int i=1;i<=num;i++) {
    		if(i%2==0) {
    			System.out.print(i+" ");
    			count = count+i;
    		}
    	}
        
		System.out.println("\nSum is :"+count);
		
        sc.close();
	}

}
