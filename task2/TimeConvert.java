package i23.task2;


import java.util.*;

public class TimeConvert {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the time in hours:");
		int t=sc.nextInt();
		
		System.out.println("The time in seconds is:"+(t*3600));
        
		sc.close();
	}

}