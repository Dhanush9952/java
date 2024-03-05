import  java.util.Scanner;

public class ColorValues {
    public static void main(String[] args) {
        //your code goes here
        Scanner x = new Scanner(System.in);
        String color = x.nextLine();
        switch(color) {
  case "red":
    System.out.println("1");
    break;
  case "green":
    System.out.println("2");
    break;
  default:
    System.out.println("3");
}
    }
}