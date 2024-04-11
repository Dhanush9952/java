import  java.util.Scanner;

public class SumValues {
    public static void main(String[] args) {
        //your code goes here
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        int sum = calculateSum(N);
        
        System.out.println(sum);
        
        scanner.close();
    }
    public static int calculateSum(int N) {
        return (N * (N + 1)) / 2;
    }
    }
    
