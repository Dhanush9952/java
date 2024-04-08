import java.util.*;
import java.io.*;
class BinarySearchExample{
	    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min + 1) + min; // Generates a random number between min (inclusive) and max (inclusive)
        }
		Arrays.sort(arr);
        return arr;
    }
	
	public static int binarySearch(int[] arr1, int target){
		int left = 0;
		int right = arr1.length - 1;
		while(left <= right){
		int mid = (left + right)/2;
		
			if(arr1[mid] == target){
				return mid;
			} else if(arr1[mid] < target){
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] randomArray = generateRandomArray(20, 1, 100); // Generates an array of 10 elements with numbers between 1 and 100
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println("Enter the element to be found:");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int result = binarySearch(randomArray, target);
		if(result != -1){
				System.out.println("Element found at index: " + result);	
		} else {
				System.out.println("Element not found");	
		}
	}
}