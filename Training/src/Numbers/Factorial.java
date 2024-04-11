package Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			System.out.println("Tha factorial is: " + factorial(n));
	}
	
	static int factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
	}

}
