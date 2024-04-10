package Numbers;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean res = true;
		if(n <= 1) {
			res = false;
		}
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n % i == 0) {
				res = false;
				break;
			}
		}
		if(res) {
			System.out.println("It is a Prime number");
		} else {
			System.out.println("It is NOT a Prime number");
		}
	}
}
