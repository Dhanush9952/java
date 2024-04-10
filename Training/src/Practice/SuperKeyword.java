package Practice;

public class SuperKeyword {
	int num1 = 20;
	final int VAL = 100;
	
	public SuperKeyword() {
		System.out.println("Default constructor...");
		// VAL = 200;   // NOT POSSIBLE TO REASSIGN FINAL VARIABLE
	}

	class SubClass extends SuperKeyword{
		public void display() {
			int num1 = 40;
			System.out.println("Sub class variable:" + num1);	
			System.out.println("Super class variable: " + super.num1);
		}
	}
	
	public static void main(String[] args) {
		SuperKeyword sk = new SuperKeyword();
		SubClass sc = sk.new SubClass();
		sc.display();
	}
}
