
import java.util.*;
import java.io.*;

	class FactorialRecursive {
    public int factorial(int n) {
    // Write your code here
    int fact = 1;
    if(n >= 1){
        fact = n * factorial(n-1);
    }
    return fact;
    }
	
	public static void main(String[] x){
	Scanner scan = new Scanner(System.in);
	FactorialRecursive obj = new FactorialRecursive();
	int num = scan.nextInt();
	System.out.println(obj.factorial(num));
	}
	}