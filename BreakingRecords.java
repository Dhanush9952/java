import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
               List<Integer> results = new ArrayList<>(Arrays.asList(0, 0)); // Initialize results list
        int maxScore = scores.get(0); // Initialize maxScore with the first score
        int minScore = scores.get(0); // Initialize minScore with the first score
        
        // Iterate through the scores
        for (int score : scores) {
            if (score > maxScore) {
                results.set(0, results.get(0) + 1); // Increment count for breaking most points record
                maxScore = score; // Update maxScore
            }
            if (score < minScore) {
                results.set(1, results.get(1) + 1); // Increment count for breaking least points record
                minScore = score; // Update minScore
            }
        }
        
        return results;
    }

}

public class BreakingRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
