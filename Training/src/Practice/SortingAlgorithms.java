package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAlgorithms {
    public static void main(String[] args) {
        // Example array for sorting
        Integer[] array = {5, 2, 8, 1, 9};

        // Using Arrays.sort() with Dual-Pivot Quicksort
        Arrays.sort(array);
        System.out.println("Sorted array using Dual-Pivot Quicksort: " + Arrays.toString(array));

        // Using Collections.sort() with Dual-Pivot Quicksort for lists
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println("Sorted list using Dual-Pivot Quicksort: " + list);

        // Merge Sort
        array = new Integer[]{5, 2, 8, 1, 9};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array using Merge Sort: " + Arrays.toString(array));

        // Insertion Sort
        array = new Integer[]{5, 2, 8, 1, 9};
        insertionSort(array);
        System.out.println("Sorted array using Insertion Sort: " + Arrays.toString(array));

        // Selection Sort
        array = new Integer[]{5, 2, 8, 1, 9};
        selectionSort(array);
        System.out.println("Sorted array using Selection Sort: " + Arrays.toString(array));

        // Bubble Sort
        array = new Integer[]{5, 2, 8, 1, 9};
        bubbleSort(array);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));

        // Heap Sort
        array = new Integer[]{5, 2, 8, 1, 9};
        heapSort(array);
        System.out.println("Sorted array using Heap Sort: " + Arrays.toString(array));
    }

    // Merge Sort implementation

    private static void mergeSort(Integer[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(Integer[] array, int left, int mid, int right) {
        // Create temporary arrays to store the left and right halves
        int n1 = mid - left + 1;
        int n2 = right - mid;
        Integer[] L = new Integer[n1];
        Integer[] R = new Integer[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Insertion Sort implementation
    private static void insertionSort(Integer[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    // Selection Sort implementation
    private static void selectionSort(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }


    // Bubble Sort implementation
    private static void bubbleSort(Integer[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by the inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }


    // Heap Sort implementation
    private static void heapSort(Integer[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    private static void heapify(Integer[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }

}

