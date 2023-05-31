package customexceptions;

import java.util.*;

class Deposit extends Exception{
	private static final long serialVersionUID = 1L;

	Deposit(String s){
		super(s);
	}
}

class Withdrawal extends Exception{
	private static final long serialVersionUID = 1L;

	Withdrawal(String s){
		super(s);
	}
}


public class Atm {
	
	@SuppressWarnings("resource")
	void bank(int balance) throws Deposit,Withdrawal{
		
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.balance");
		System.out.println("4.exit");
		System.out.print("\nEnter your choice:");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("\namount to deposit: ");
			
			int amount = sc.nextInt();		
			if(amount<=500) {
				throw new Deposit("deposit more than 500");
			}
			else {
				balance= balance+amount;
				System.out.println("balance is: "+balance);
				System.exit(0);
			}
			
		case 2:
			System.out.println("\namount to withdraw: ");
			
			int with_amt = sc.nextInt();
			
			if(with_amt<balance) {
				balance = balance-with_amt;
				System.out.println("balance is: "+balance);
				System.exit(0);
			}
			else {
				throw new Withdrawal("insufficient balance");
			}
			
		case 3:
			System.out.println("\nbalance is: "+balance);
			System.exit(0);
			
		case 4:
			System.out.println("\nexited ");
			System.exit(0);
			
		default:
			System.out.println("choose correct option");	
		}
		
		sc.close();
	}
	
	public static void main(String[] args) throws Deposit,Withdrawal {
		
		Atm a = new Atm();
		
		int init_balance=10000;
		
		a.bank(init_balance);
		
	}	

}
