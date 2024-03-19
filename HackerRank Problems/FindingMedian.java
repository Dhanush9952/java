import java.util.*;
import java.Collections.*;
import java.io.*;

public static int findMedian(List<Integer> arr) {
    // Sort the list in ascending order
    Collections.sort(arr);
    
    int n = arr.size();
    
    // If the list has an odd number of elements
    if (n % 2 != 0) {
        return arr.get(n / 2);
    }
    // If the list has an even number of elements
    else {
        int middleIndex1 = n / 2 - 1;
        int middleIndex2 = n / 2;
        return (arr.get(middleIndex1) + arr.get(middleIndex2)) / 2;
    }
}
class FindingMedian{
public static void main(String[] x){
Scanner scan = new Scanner(System.in);

}
}