package Numbers;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean res = true;
		if(n <= 1) {
			res = false;  // 0 and 1 are not prime numbers 
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				res = false;
				break;
			}
		}
		if(res) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
