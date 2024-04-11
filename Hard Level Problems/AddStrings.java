
/*
	Time complexity: O(|NUM1| + |NUM2|)
	Space complexity: O(1)
	
	Where |NUM1| and |NUM2| are the length of the strings.
*/

/*
public class AddStrings {

	public static String reverseString(String str) {

		if (str.length() == 0) {
			return "";
		}
		String newStr = "";
		newStr += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		return newStr;
	}

	public static String stringConcatenation(String num1, String num2) {

		// Indices to traverse the strings.
		int idx1 = num1.length() - 1;
		int idx2 = num2.length() - 1;

		// To store the sum.
		String res = "";

		// To store the carry.
		int carry = 0;

		// Add characters individually,
		while (idx1 >= 0 || idx2 >= 0) {

			// To store sum of current character.
			int localSum = 0;

			// Check if num1 is present.
			if (idx1 >= 0) {

				// Add current character.
				localSum += num1.charAt(idx1) - '0';
				--idx1;
			}

			// Check if num2 is present.
			if (idx2 >= 0) {

				// Add current character.
				localSum += num2.charAt(idx2) - '0';
				--idx2;
			}

			// Add carry to the sum.
			localSum += carry;

			carry = 0;

			// Check if sum is greater than 9.
			if (localSum > 9) {

				// Update sum and carry.
				localSum %= 10;
				carry = 1;
			}

			// Update the result.
			res += (localSum % 10);
		}

		// If carry is present.
		if (carry == 1) {
			res += '1';
		}

		// Reverse the string.

		return reverseString(res);
	}

}
*/

// num1 and num2 are two numbers given in string format. we have to add those two strings witout using conversion functions 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static String stringConcatenation(String num1, String num2) {
        // Write your code here.
        String check = "0123456789";
        StringBuilder n1 = new StringBuilder(num1).reverse();
        StringBuilder n2 = new StringBuilder(num2).reverse();
        int n = num1.length();
        int m = num2.length();
        StringBuilder ans = new StringBuilder();
        int carry=0;
        int i=0;
        int j=0;
		
        while (i<n || j < m || carry!=0) {
            int local_sum = carry;
            if (i<n) {
                local_sum+=check.indexOf(n1.charAt(i));
                i++;
            }
            if (j<m) {
                local_sum+=check.indexOf(n2.charAt(j));
                j++;
            }
            carry = local_sum/10;
            local_sum=local_sum%10;
            ans.append(local_sum);
        }
        return ans.reverse().toString();
    }
}

