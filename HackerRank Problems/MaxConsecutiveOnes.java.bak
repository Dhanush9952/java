import java.util.Scanner;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        // Iterate through each bit of the binary representation
        while (n > 0) {
            // Check if the least significant bit is 1
            if ((n & 1) == 1) {
                // If it is, increment the count of consecutive ones
                currentConsecutiveOnes++;
            } else {
                // If it's not, update the maximum count if the current count is greater
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                // Reset the count of consecutive ones
                currentConsecutiveOnes = 0;
            }
            // Right shift the number to move to the next bit
            n >>= 1;
        }
        // Update the maximum count if there are consecutive ones at the end of the binary representation
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
        System.out.println(maxConsecutiveOnes);
        scanner.close();
    }
}
