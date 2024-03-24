import java.util.Scanner;

class AsciiToInt {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       int asciiValue = (int) a;
       System.out.println(asciiValue); 
    }   
}