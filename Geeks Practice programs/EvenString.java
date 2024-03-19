import java.io.*;
import java.util.*;
class EvenString{
	public static void main(String[] x){
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");
		//char even = sentence.toCharArray();
		for(String even : words){
			if(even.length() % 2 == 0){
				System.out.println(even);
			}
		}
	}
}