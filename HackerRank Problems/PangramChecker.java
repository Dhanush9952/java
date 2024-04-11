import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String sentence = scanner.nextLine();
        
        if (isPangram(sentence.toLowerCase())) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        
        return letters.size() == 26; // There are 26 letters in the English alphabet
    }
}
