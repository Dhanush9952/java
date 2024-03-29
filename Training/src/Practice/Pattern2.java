package Practice;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] x) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int N = scan.nextInt();
	for(int i=0; i<N; i++) {
		for(int j=N-1; j>=i; j--) {
			System.out.print("*");
		}
		System.out.println();		
	}
}
}
