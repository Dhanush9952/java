import java.io.*;
import java.util.*;

public class NestedLogic{
        Scanner sc = new Scanner(System.in);
        BookReturnDate actualDate = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        BookReturnDate expectedDate = new BookReturnDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
        int fine = 0;
        if (inputsValid2(actualDate, expectedDate)) {
            if (expectedDate.year == actualDate.year) {
                if (expectedDate.month < actualDate.month) {
                    fine = (actualDate.month - expectedDate.month) * 500;
                } else if (expectedDate.month == actualDate.month && (expectedDate.day < actualDate.day)) {
                    fine = (actualDate.day - expectedDate.day) * 15;
                }
            } else if (expectedDate.year < actualDate.year) {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }

    public static boolean inputsValid2(BookReturnDate actualDate, BookReturnDate expectedDate) {
        return validateDay(actualDate.day) && validateDay(expectedDate.day)
                && validateMoth(actualDate.month) && validateMoth(expectedDate.month)
                && validateYear(actualDate.year) && validateYear(expectedDate.year);
    }


//    public static boolean inputsValid1(BookReturnDate actualDate, BookReturnDate expectedDate) {
//        if ((actualDate.day < 1 && actualDate.day > 31) || (expectedDate.day < 1 && expectedDate.day > 31)) {
//            return false;
//        } else if ((actualDate.month < 1 && actualDate.month > 12)
//                || (expectedDate.month < 1 && expectedDate.month > 12)) {
//            return false;
//        } else if ((actualDate.year < 1 && actualDate.year > 3000)
//                || (expectedDate.year < 1 && expectedDate.year > 3000)) {
//            return false;
//        }
//        return true;
//    }

    public static boolean validateDay(int day) {
        return day >= 1 && day <= 31;
    }

    public static boolean validateMoth(int month) {
        return month >= 1 && month <= 12;
    }

    public static boolean validateYear(int year) {
        return year >= 1 && year <= 3000;
    }
}


class BookReturnDate {

    public int day;
    public int month;
    public int year;

    public BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

}

//https://www.hackerrank.com/challenges/30-nested-logic/problem?isFullScreen=true