public class ArrayAddress {
    public static void main(String[] args) {
        // Define array parameters
        int[] array = new int[5]; // Array with 5 elements
        int baseAddress = 1000;   // Base address
        int lowerBound = 0;       // Lower bound (index of the first element)
        int elementSize = 4;      // Size of each element in bytes (assuming int)

        // Calculate and print the address of each element
        for (int i = 0; i < array.length; i++) {
            int address = baseAddress + (i - lowerBound) * elementSize;
            System.out.println("Address of A[" + i + "]: " + address);
        }
    }
}
