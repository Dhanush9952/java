public class LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600851475143L;
        long largestPrimeFactor = findLargestPrimeFactor(num);
        System.out.println("Largest prime factor of " + num + " is: " + largestPrimeFactor);
    }

    // Function to find the largest prime factor of a number
    public static long findLargestPrimeFactor(long n) {
        long largestPrimeFactor = 1;

        // Check for divisibility by 2 repeatedly and update n
        while (n % 2 == 0) {
            largestPrimeFactor = 2;
            n /= 2;
        }

        // At this point, n is odd, so we only need to check odd factors
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            }
        }

        // If n is a prime number greater than 2, it is the largest prime factor
        if (n > 2) {
            largestPrimeFactor = n;
        }

        return largestPrimeFactor;
    }
}
