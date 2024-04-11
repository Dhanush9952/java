import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class KthCharacter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int kthValue = scan.nextInt();
		scan.nextLine();
        String chars = scan.nextLine().trim();
        char[] ch = chars.toCharArray();
        char[] rev = new char[length];
		int inc = 0;
        for(int i=length-1; i>=0; i--){
          rev[i] = ch[inc];
          inc++;
        }
        System.out.println(rev);
		System.out.println(rev[kthValue-1]);
    }
}