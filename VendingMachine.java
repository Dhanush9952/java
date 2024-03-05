import  java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();
 if (choice >= 0 && choice < 5) {
            // Output the corresponding menu item
            String chosenDrink = menu[choice];
            System.out.println(chosenDrink);
        } else {
            // Output "Invalid" if the choice is out of range
            System.out.println("Invalid");
        }
        
    }

}