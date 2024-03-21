/* import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i < n ; i++){
            int acc = scanner.nextInt();
            int accNum = scanner.nextInt();
            if(!map.containsKey(accNum)){
                map.put(accNum,acc);
            }
            else{
                map.put(accNum,map.get(accNum) + acc);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        int minKey = 0;
        int minValue = Integer.MAX_VALUE;
        for(int v:map.keySet()){
            if(map.get(v) > maxValue){
                maxValue = map.get(v);
                maxKey = v;
            } else if (map.get(v) == maxValue) {
                if(maxKey < v){
                    maxKey = v;
                }
            }
        }
        for(int v:map.keySet()){
            if(map.get(v) < minValue){
                minValue = map.get(v);
                minKey = v;
            } else if (map.get(v) == minValue) {
                if(minKey > v){
                    minKey = v;
                }
            }
        }
        System.out.println(Math.abs(maxKey - minKey));   
    }
}
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Mapping number to its frequency
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the queries
        for (int i = 0; i < n; i++) {
            int frequency = scanner.nextInt();
            int number = scanner.nextInt();
            
            // Updating the frequency of the number
            map.put(number, map.getOrDefault(number, 0) + frequency);
        }
        
        int maxFrequency = 0;
        int maxNumber = 0;
        int minFrequency = Integer.MAX_VALUE;
        int minNumber = 0;
        
        // Finding the number with maximum and minimum frequencies
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            
            if (frequency > maxFrequency || (frequency == maxFrequency && key > maxNumber)) {
                maxFrequency = frequency;
                maxNumber = key;
            }
            
            if (frequency < minFrequency || (frequency == minFrequency && key < minNumber)) {
                minFrequency = frequency;
                minNumber = key;
            }
        }
        
        // Calculating and printing the absolute difference
        System.out.println(Math.abs(maxNumber - minNumber));
    }
}
