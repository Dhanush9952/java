import java.util.*;
import java.io.*;
class InsertionSortExample{
	
	public static int[] insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
		return a;
	}
	
		public static void main(String[] args){
			int arr[] = {4, 3, 8, 5, 2, 9, 6};
			System.out.println("Before Sorting: ");
			for(int n : arr){
				System.out.print(n + " ");	
			}
			System.out.println();
			insertionSort(arr);
			System.out.println("After Sorting: ");
			for(int num : arr){
				System.out.print(num + " ");	
			}
			
		}
}