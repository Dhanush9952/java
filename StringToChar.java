import java.util.*;
import java.util.Scanner;
// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
static String isBalanced(String s) {
    Stack<Character> stack = new Stack<>();
    final String YES = "YES";
    final String NO = "NO";

    for (char ch : s.toCharArray()) {
        if (ch == '{' || ch == '[' || ch == '(') {
            stack.push(ch);
        } else if (ch == '}' || ch == ']' || ch == ')') {
            if (stack.isEmpty()) {
                return NO; // Unmatched closing bracket
            }
            char top = stack.pop();
            if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                return NO; // Mismatched opening and closing brackets
            }
        }
    }

    return stack.isEmpty() ? YES : NO; // Check if there are any unmatched opening brackets
}

}

class StringToChar {
	public static void main(String[] args) {
		Parser parser = new Parser();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
		in.close();
	}
}
