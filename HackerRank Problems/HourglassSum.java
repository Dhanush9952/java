import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HourglassSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();

        // Read input for 6 rows
        for (int i = 0; i < 6; i++) {
            String[] rowElements = scanner.nextLine().trim().split(" ");
            List<Integer> row = new ArrayList<>();
            for (String element : rowElements) {
                row.add(Integer.parseInt(element));
            }
            arr.add(row);
        }

        hourglass(arr);
        scanner.close();
    }

    public static void hourglass(List<List<Integer>> arr) {
        // Your implementation of the hourglass method goes here
		        int result =0;
        int max =0;
        for(int i=0; i<= arr.size()-3; i++){
            for(int j=0; j<= arr.size()-3; j++){
                result =0;
                result += ((arr.get(i).get(j)) + (arr.get(i).get(j+1)) + (arr.get(i).get(j+2)));
                result += (arr.get(i+1).get(j+1));
                result += ((arr.get(i+2).get(j)) + (arr.get(i+2).get(j+1)) + (arr.get(i+2).get(j+2)));
                if(i==0 && j==0){
                    max = result;
                }
                if(result > max) max= result;
            }
            
        }
        System.out.println(max);
  
    }
}