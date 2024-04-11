import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ModInRange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0)
      {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = (r/2)>=l ? r%((r/2)+1) : (r%l);
        System.out.println(ans);
      }

    }
}