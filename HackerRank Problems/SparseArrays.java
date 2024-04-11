import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        ArrayList<Integer> result = new ArrayList<>();
    // Write your code here
    for (String query : queries) {
        int count = 0; // Initialize the count for the current query

        // Count the occurrences of the current query in the strings list
        for (String str : strings) {
            if (str.equals(query)) {
                count++;
            }
        }

        result.add(count); // Add the count to the result list
    }

    return result;
    }

}

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for strings list
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < numStrings; i++) {
            strings.add(scanner.nextLine());
        }

        // Get input for queries list
        System.out.print("Enter the number of queries: ");
        int numQueries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> queries = new ArrayList<>();
        System.out.println("Enter the queries:");
        for (int i = 0; i < numQueries; i++) {
            queries.add(scanner.nextLine());
        }

        // Call the matchingStrings method
//        List<Integer> result = matchingStrings(strings, queries);
		List<Integer> result = Result.matchingStrings(strings, queries);


        // Print the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
