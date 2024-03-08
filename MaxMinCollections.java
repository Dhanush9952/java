import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinCollections {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            //your code goes here
            nums.add(num);
        }
        
        //your code goes here
        int max = Collections.max(nums);
        System.out.println(max);
        int min = Collections.min(nums);
        System.out.println(min);
    }
}