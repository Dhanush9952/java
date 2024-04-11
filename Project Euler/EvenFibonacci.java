import java.io.*;
import java.util.*;

public class EvenFibonacci {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = sumOfEvenFibonacciNumbers(limit);
        System.out.println("The sum of even-valued terms in the Fibonacci sequence below 4 million is: " + sum);
    }

    public static int sumOfEvenFibonacciNumbers(int limit) {
        int sum = 0;
        int first = 1;
        int second = 2;
        while (second <= limit) {
            if (second % 2 == 0) {
                sum += second;
            }
            int next = first + second;
            first = second;
            second = next;
        }
        return sum;
    }
}



