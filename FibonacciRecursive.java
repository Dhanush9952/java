import java.util.*;
class FibonacciRecursive{
	int x;
	public int fibonacci(int x){
	if(x==0){
		return 0;
	} else if(x==1){
		return 1;
	} else {
		return (fibonacci(x-1) + fibonacci(x-2));
	}
}
	public static void main(String args[]){
		FibonacciRecursive fr = new FibonacciRecursive();
		fr.x = Integer.parseInt(args[0]);
		for(int i=0; i <= fr.x; i++){
			System.out.println(fr.fibonacci(i));
		}
	}
}