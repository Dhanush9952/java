package Numbers;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");		
		int n = sc.nextInt();
		System.out.println("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}
	
	static int fibonacci(int n) {
		if(n <= 1) return n; 
		else return fibonacci(n-1) + fibonacci(n-2);
	}
}
