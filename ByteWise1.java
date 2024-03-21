import java.util.Scanner;

public class ByteWise1 {
    public static void main(String[] args) {
		
		System.out.println("Enter Integer(int) numer:");
        Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		char[] bitArray1 = new char[32];
		for(int i=31; i>=0; i--){
			int bit = (number1 >> i) & 1;
			bitArray1[31 - i] = (char) (bit + '0');
		}
		System.out.println(bitArray1);
		
		System.out.println("Enter Long(long) numer:");
		long number2 = scan.nextLong();
		char[] bitArray2 = new char[64];
		for(int i=63; i>=0; i--){
			int bit = (int)((number2 >> i) & 1);
			bitArray2[63 - i] = (char) (bit + '0');
		}
		System.out.println(bitArray2);
    }
}
