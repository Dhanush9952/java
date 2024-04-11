import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. Year must be divisible by 4
        // 2. If divisible by 100, it must also be divisible by 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
