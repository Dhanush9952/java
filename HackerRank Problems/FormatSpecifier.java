import java.util.Scanner;

public class FormatSpecifier {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  

    System.out.println("================================");            
    for (int i = 0; i < 3; i++) {
        String name = scanner.next();
        int num = scanner.nextInt();
        System.out.printf("%-15s%03d%n", name, num);
    }
    System.out.println("================================");

    }
}



