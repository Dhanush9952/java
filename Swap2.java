import java.util.Scanner;
public class Swap2{
public static void main(String x[]){
	int value1, value2;
Scanner s = new Scanner(System.in);
System.out.println("Enter 2 numbers: ");
System.out.println("Value 1: ");
value1 = s.nextInt();
System.out.println("Value 2: ");
value2 = s.nextInt();
value1 = value1 + value2;
value2 = value1 - value2;
value1 = value1 - value2;
System.out.println("Swapped numbers are: ");
System.out.println("Value 1: " + value1);
System.out.println("Value 2: " + value2);
}
}