package Practice;

import java.util.Scanner;
public class Zomato {
	public static void main(String[] args) {
		login();
		
		}
	
	static void login() {
		String opt1 = "Y";
		Scanner sc = new Scanner(System.in);
		while(opt1 == "Y") {
			System.out.println("Enter the username:");
			String username = sc.nextLine();
			System.out.println("Enter the password:");
			String password = sc.nextLine();
			if(username.equals("dhan") && password.equals("dhan@123")) {
				System.out.println("Welcome to Zomato!");	
				hotels();
				break;
			} else {
				System.out.println("Incorrect username or password !");
				System.out.println("Try again? Y/N");
				String opt2 = sc.nextLine();
				if(opt2.equals("Y")) {
					continue;
				} else {
					opt1 = "O";
					System.out.println("Login Cancelled");					
				}
				}
		}
	}
	
	static void hotels() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a hotel... ");
		System.out.println("=============================");
		System.out.println("No   Hotels/Restaurants  Dist");
		System.out.println("=============================");
		System.out.println("1) Hyderabad Biryani  -  10km");
		System.out.println("2) Urban Barbeque     -  15km");
		System.out.println("3) Chinese Valley     -  20km");
		System.out.println("4) Sherlock's Kitchen -  12km");
		System.out.println("5) Chettinaad Hotel   -  8km");
		System.out.println("Enter a choice(1-5):");
		choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Hyderabad Biryani");
		System.out.println("=====================");
		break;
		case 2: System.out.println("Urban Barbeque Menu");
		System.out.println("=========================");
		System.out.println("No     Items       Price");
		System.out.println("=========================");
		System.out.println("1) Egg Biryani    - Rs:90");
		System.out.println("2) Chappatti      - Rs:50");
		System.out.println("3) Pepper Chicken - Rs:80");
		System.out.println("4) Idly           - Rs:30");
		System.out.println("5) Paratha        - Rs:70");
		System.out.println("Enter a choice(1-5):");
		int dish4 = sc.nextInt();
		payment(dish4);
		break;
		case 5: System.out.println("Chettinaad Hotel Menu");
		System.out.println("=========================");
		System.out.println("No     Items       Price");
		System.out.println("=========================");
		System.out.println("1) Egg Biryani    - Rs:90");
		System.out.println("2) Chappatti      - Rs:50");
		System.out.println("3) Pepper Chicken - Rs:80");
		System.out.println("4) Idly           - Rs:30");
		System.out.println("5) Paratha        - Rs:70");
		System.out.println("Enter a choice(1-5):");
		int dish = sc.nextInt();
		payment(dish);
		break;
		default: System.out.println("Please enter valid option(1-5)");
		}
	}
	
	static void payment(int dish) {
		Scanner sc = new Scanner(System.in);
		if(dish == 4) {
			int price = 0;
			System.out.println("Enter the quantity:");
			int qty5 = sc.nextInt();
			for(int i=0; i<qty5; i++) {
				price += 30;
			}
			int totalamount = price + 40;
			System.out.println("For " + qty5 + " quantity => Rs: " + price + " + Delivery charge of Rs-40 including taxes");
			System.out.println("Total amount to be paid = Rs: " + totalamount);
			System.out.println("Proceed to payment? press (0/1))");
			int paymentconfirmation = sc.nextInt();
			if(paymentconfirmation == 1) {
				System.out.println("Select payment method:(1-3)");
				System.out.println("1) Phone pe");
				System.out.println("2) Google pay");
				System.out.println("3) COD");
				int paymentoption = sc.nextInt();
			}
			System.out.println("Enter the OTP: ");
			int otp = sc.nextInt();
			System.out.println("OTP verified ✔");
			System.out.println("Your order will be delivered within 1 hour. Thankyou!");
		}
	}
	
	

}
