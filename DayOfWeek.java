/*import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day, month, and year
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Calculate day of the week
        String dayOfWeek = calculateDayOfWeek(day, month, year);

        // Output result
        System.out.println("The day of the week is: " + dayOfWeek);

        scanner.close();
    }

    public static String calculateDayOfWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month in Calendar starts from 0

        // Get day of the week
        int dayOfWeekIndex = calendar.get(Calendar.DAY_OF_WEEK);

        // Map day index to day name
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String ans = daysOfWeek[dayOfWeekIndex - 1];
        return ans.toUpperCase();
    }
}
*/


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day, month, and year
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Calculate day of the week
        String dayOfWeek = calculateDayOfWeek(day, month, year);

        // Output result
        System.out.println("The day of the week is: " + dayOfWeek);

        scanner.close();
    }

    public static String calculateDayOfWeek(int day, int month, int year) {
        // January and February are counted as months 13 and 14 of the previous year
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int q = day;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        // Zeller's Congruence formula
        int h = (q + (13*(m + 1))/5 + K + K/4 + J/4 + 5*J) % 7;
		//        int h = (q + (13*(m + 1))/5 + K + K/4 + J/4 - 2*J) % 7;

        // Map h to day name
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return daysOfWeek[h];
    }
}
