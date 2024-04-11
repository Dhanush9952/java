package Practice;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N = scan.nextInt();
		for(int i=N; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
