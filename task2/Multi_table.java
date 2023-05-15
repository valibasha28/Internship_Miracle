package i23.task2;


import java.util.Scanner;

public class Multi_table {
	
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number:");
        int n=sc.nextInt();
        
        for(int i=1; i <= 12; i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        
        sc.close();
    }
}