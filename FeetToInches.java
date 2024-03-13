import java.util.Scanner;

public class FeetToInches {
    //your code goes here
    static void convert(double footValue){
        double inches = footValue * 12;
        System.out.println(inches);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foot = sc.nextDouble(); 
        convert(foot);
    }
}