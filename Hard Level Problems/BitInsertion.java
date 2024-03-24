import java.util.Scanner;

public class BitInsertion {
    public static int insertNumber(int X, int Y, int A, int B) {
        // Step 1: Create a mask to clear the bits from position A to position B in X
        int mask = ((1 << (B - A + 1)) - 1) << A;
        
        // Step 2: Clear the bits in X from position A to position B using the mask
        X &= ~mask;
        
        // Step 3: Left shift Y by A positions to align it with the cleared bits in X
        Y <<= A;
        
        // Step 4: Merge the modified X and shifted Y using bitwise OR operation
        int result = X | Y;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(insertNumber(X, Y, A, B));
        }
        scanner.close();
    }
}
