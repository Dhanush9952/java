import java.io.*;
import java.util.*;

class Result {

    public static long flippingBits(long n) {
        return n ^ ((1L << 32) - 1);
    }

}

public class FlippingBits {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Iterate over each query
        for (int i = 0; i < q; i++) {
            // Read the value of n for the current query
            long n = scanner.nextLong();
            
            // Calculate the result by flipping the bits of n
            long result = Result.flippingBits(n);

            // Print the result
            System.out.println(result);
        }

        scanner.close();
    }
}
