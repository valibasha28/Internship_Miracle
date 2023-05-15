package i23.task2;

public class Patterns {
	
	public static void main(String[] args) {
		
		
		/*
		System.out.println("3*3 pattern");
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=3;b++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		*/
		
		/*
		System.out.println("\nRight angle triangle pattern");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		*/
		
		/*
		System.out.println("\nReverse Right angle triangle pattern");
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		*/
		
		/*
		System.out.println("3*3 Number pattern");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("\n");
		}
		*/
		
		for(int i=1;i<=4;i++) {
			for(int k=i;k>=2;k--) {
				System.out.print("\t"+k);
			}
				
			for(int j=4;j>=1;j--) {
				System.out.print("\t"+i);
			}
			System.out.println("\n");
		}
		
	}

}