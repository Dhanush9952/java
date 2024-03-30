package Practice;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N = scan.nextInt();
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}
