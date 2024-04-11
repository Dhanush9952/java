import java.util.*;
import java.io.*;
public class FindSetBitPosition {
    public static int findSetBitPosition(int N) {
        // Convert N to binary and count the number of set bits
        String binary = Integer.toBinaryString(N);
        int setBitsCount = 0;
        int position = -1;
        
        // Loop through each character in the binary string
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                setBitsCount++;
                position = binary.length() - i;
            }
        }
        // If setBitsCount is not equal to 1, return -1
        if (setBitsCount != 1) {
            return -1;
        }
        
        // Return the position of the set bit
        return position;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {2, 8, 11, 0, 16, 21, 32, 58, 64};
        
        // Print results for each test case
        for (int N : testCases) {
            System.out.println("For N = " + N + ", the lone 1-bit is at position: " + findSetBitPosition(N));
        }
    }
}



public class FindSetBitPosition {
    public static int findSetBitPosition(int N) {
        // Check if N is a power of 2
        if ((N & (N - 1)) != 0) {
            // If N is not a power of 2, it has either no set bit or more than one set bit
            return -1;
        }
        
        int position = 0;
        while (N > 0) {
            N >>= 1; // Right shift N by 1 bit
            position++;
        }
        
        return position;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {2, 8, 11, 0, 16, 21, 32, 58, 64};
        
        // Print results for each test case
        for (int N : testCases) {
            System.out.println("For N = " + N + ", the output is " + findSetBitPosition(N));
        }
    }
}

