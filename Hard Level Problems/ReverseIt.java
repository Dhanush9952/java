/*
We are given a string s consisting of only lowercase letters of english, and a character ch.

Let the index of last occurence of ch be idx, reverse the string from idx.

Input Format
First line contains a string s.

Output Format
Return the transformed string

Constraints
1<=|s|<=100000

Sample Testcase 0
Testcase Input
abc c
Testcase Output
abc
Explanation
Last occurrence of c is the last character of the string, so reversing it won’t change the string.
Sample Testcase 1
Testcase Input
abxcced c
Testcase Output
abxcdec
Explanation
The last index of 'c' occuring is:4. Reersing the string from 4th index: "ced" to "dec". 


The final string therefore is: "abxcdec".
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ReverseIt {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] split = s.split(" ");
        char ch[] = split[0].toCharArray();
        char ch2[] = split[1].toCharArray();
        String end = split[1];
        int len = split[0].length();

		for(int i = len-1; i>=0; i--){
			if(ch[i] == ch2[0]){
			int start = i;
			for(int j = len-1; j>start; j--){
				System.out.print(ch[j]);
			}
			}
			//System.out.print(ch[i]);
		}
    }
}

