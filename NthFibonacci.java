import java.util.*;

public class NthFibonacci {
    static final int MOD = (int) 1e9 + 7;

    // Method to perform matrix multiplication
    static long[][] multiply(long[][] A, long[][] B) {
        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;
        long[][] C = new long[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    C[i][j] = (C[i][j] + (A[i][k] * B[k][j]) % MOD) % MOD;
                }
            }
        }
        return C;
    }

    // Method to perform matrix exponentiation
    static long[][] power(long[][] M, int n) {
        if (n == 1) return M;
        long[][] half = power(M, n / 2);
        long[][] result = multiply(half, half);
        if (n % 2 == 1) result = multiply(result, M);
        return result;
    }

    // Method to find the Nth Fibonacci number using matrix exponentiation
    public static int fibonacciNumber(int n) {
        if (n <= 1) return n;
        long[][] M = {{1, 1}, {1, 0}};
        long[][] result = power(M, n - 1);
        return (int) result[0][0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacciNumber(n));
        scanner.close();
    }
}
