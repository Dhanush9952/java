import java.io.*;
import java.util.*;
class PracticeList1{
	public static void main(String[] args){
		ArrayList<Integer> res = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			res.add(sc.nextInt());
		}
		for(int r : res){
			System.out.println(r + " -> ");
		}
		
		// Getting the index 3 of res List using get method
		int t = res.get(3);
		System.out.println(t + " is the 4th element");
		// Updating index 2 of res List using set method
		res.set(2, 101);
		
		System.out.println("updated");
				for(int r : res){
			System.out.println(r + " -> ");
		}
	}
}