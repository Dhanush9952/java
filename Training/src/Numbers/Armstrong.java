package Numbers;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int res = 0, num = n;
		int len =  String.valueOf(n).length();
		while(num>0) {
			int digit = num%10;
			res = res + (int) Math.pow(digit, len);
			num = num/10;
		}
		if(res == n) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("Not an armstrong number");			
		}
	}

}
