import java.util.*;

public class UniqueStringFinder {
    public static String findKthUniqueString(List<String> strings, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each string
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        int uniqueCount = 0;

        // Find the kth unique string
        for (String str : strings) {
            if (frequencyMap.get(str) == 1) {
                uniqueCount++;
            }
            if (uniqueCount == k) {
                return str;
            }
        }

        // If there are fewer than k unique strings, return an empty string
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of strings
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the strings
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            strings.add(scanner.nextLine());
        }

        // Input the value of k
        int k = scanner.nextInt();

        // Find and print the kth unique string
        String kthUniqueString = findKthUniqueString(strings, k);
        System.out.println(kthUniqueString);

        scanner.close();
    }
}
