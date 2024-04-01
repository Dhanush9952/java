import java.io.*;
import java.util.*;

public class StaticInitializer {

    static {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        area(breadth, height);
        sc.close();
    }
    
    public static void area(int b, int h) {
        if(b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    };
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}