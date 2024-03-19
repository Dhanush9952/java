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
        String chars = scan.nextLine();
        char[] ch = chars.toCharArray();
        char[] rev = '';
        for(int i=length-1; i>length; i--){
          int inc = 0;
          rev[i] = ch[inc];
          inc++;
        }
        System.out.println(rev);
    }
}