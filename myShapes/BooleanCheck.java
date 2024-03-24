import java.util.Scanner;
class BooleanCheck{
		public boolean add(int value){
			if(value == 1){
			return true;
			}
		else if(value == 0) {
			return false;
		}
		return true;
		}
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		BooleanCheck i = new BooleanCheck();
		System.out.println(i.add(num));
	}
}