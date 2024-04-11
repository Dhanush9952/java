import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] take){
        elements = take;
    }
    
    public void computeDifference(){
    int maxValue = Integer.MIN_VALUE;
    for (int i = 0; i < elements.length; i++) {
        for (int j = i + 1; j < elements.length; j++) {
            int diff = Math.abs(elements[i] - elements[j]);
            if (diff > maxValue) {
                maxValue = diff;
            }
        }
    }
    maximumDifference = maxValue;
    }
} // End of Difference class

public class AbsoluteDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}