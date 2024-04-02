import java.util.Scanner;

public class PrimeNumberOpt {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // multiples of 2 and 3 are not prime
        }
        
        // Check for divisibility by numbers greater than 3 up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false; // if n is divisible by i or i+2, then it's not prime
            }
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // number to be tested for primality
            boolean result = isPrime(n);
            if (result) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scanner.close();
    }
}
