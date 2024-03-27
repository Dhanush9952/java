import java.util.ArrayList;
import java.util.Scanner;
class Test{
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				ArrayList<Integer> nums = new ArrayList<>();
		for(int i=0; i<n; i++){
			nums.add(sc.nextInt());
		}
		System.out.println(nums.get(0));
		
	}
}