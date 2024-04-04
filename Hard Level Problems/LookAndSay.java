/*
The Look-And-Say sequence is a sequence of positive integers. The sequence is as follows:

1, 11, 21, 1211, 111221, 312211, 13112221,...

This sequence is constructed in the following way:

The first number is 1.

This is read as “One 1”. 
Hence, the second number will be 11.

The second number is read as “Two 1s”. 
Hence, the third number will be 21.

The third number is read as “One 2, One 1”. 
Hence, the fourth number will be 1211. And so on.

The fourth term is read as “One 1, One 2, Two 1s”.

Hence, the fifth term will be 111221. And so on.
Given an integer N, find the Nth term of the sequence.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 30
1 <= N <= 40

Where 'T' is the number of test cases and 'N' is the given sequence index.

Time Limit: 1 sec
Sample Input 1:
3
1
2
3
Sample Output 1:
1
11
21
Explanation for Sample 1:
The first term is 1.

The second term is 11.

The third term is 21.
Sample Input 2:
1
6
Sample Output 2:
312211
*/

public class Solution {
    public static String lookAndSaySequence(int n) {
        // Write your code here.
        if(n == 1){
            return "1";
        }
        String prevTerm = "1";
        for(int i = 2; i <= n; i++){ // Corrected loop condition
            StringBuilder nextTerm = new StringBuilder();
            char prevChar = prevTerm.charAt(0);
            int count = 1;
            for(int j = 1; j < prevTerm.length(); j++){
                if(prevTerm.charAt(j) == prevChar){
                    count++;
                } else {
                    nextTerm.append(count).append(prevChar);
                    prevChar = prevTerm.charAt(j);
                    count = 1;
                }
            }
            nextTerm.append(count).append(prevChar);
            prevTerm = nextTerm.toString();
        }
        return prevTerm;
    }
}

