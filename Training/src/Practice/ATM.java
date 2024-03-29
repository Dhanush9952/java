package Practice;
import java.util.Scanner;
public class ATM {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int balance = 1000;
	System.out.println("1.Check Balance");
	System.out.println("2.Withdraw Cash");
	System.out.println("3.Deposit Amount");
	System.out.println("4.Exit");
	System.out.println("Enter an option: ");
	int option = scan.nextInt();
	switch(option) {
	case 1: System.out.println("Your account balance: " + balance);
	break;
	case 2: System.out.println("Enter the withdrawl amount: ");
	int withdraw = scan.nextInt();
	balance -= withdraw;
	System.out.println("Account balance after withdrawl: " + balance);
	break;
	case 3: System.out.println("Enter the deposit amount: ");
	int deposit = scan.nextInt();
	balance += deposit;
	System.out.println("Account Balance after deposit: " + balance);
	break;
	case 4: System.out.println("");
	break;
	default: System.out.println("");
	}
}
}
