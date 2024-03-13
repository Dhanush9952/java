import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        try {
            // Check if the choice is within the array bounds
            if (choice >= 0 && choice < categories.length) {
                System.out.println(categories[choice]);
            } else {
                System.out.println("Wrong Option");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the situation where the index is out of range
            System.out.println("Wrong Option");
        }
    }
}
