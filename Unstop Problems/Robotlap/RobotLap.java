import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class RobotLap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         sc.nextLine();
        String dir = sc.nextLine();
        String res = checkOrigin(n, dir);
        System.out.println(res);
    }

    static String checkOrigin(int n, String s){
      int horizontal = 0, vertical = 0;
      for(char ch : s.toCharArray()){
        if(ch == 'U'){
          vertical++;
        } else if(ch == 'D'){
          vertical--;
        } else if(ch == 'L'){
          horizontal--;
        } else if(ch == 'R'){
          horizontal++;
        }
      }
      if(horizontal == 0 && vertical == 0){
        return "YES";
      } else {
        return "NO";
      }
    }
}