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


for (int i = 0; i < n; i++) {
    int numberOfSwaps = 0;
    for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
   
    if (numberOfSwaps == 0) {
        break;
    }
}
