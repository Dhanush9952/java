import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
       
        int sum = 0;
        //your code goes here
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            int n = iterator.next();	// .next() means the next element in list(starts from first element), if used again it points to second(next), third and so on.
            sum += n;
        }
        System.out.println(sum);
    }
}