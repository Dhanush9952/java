import java.util.*;
class FibonacciRecursive{
	public int fibonacci(int n){
	if(n <= 1) return 1; 
	else return fibonacci(n-1) + fibonacci(n-2);
}
	public static void main(String args[]){
		FibonacciRecursive fr = new FibonacciRecursive();
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		for(int i=0; i <= num; i++){
			System.out.println(fr.fibonacci(i));
		}
	}
}