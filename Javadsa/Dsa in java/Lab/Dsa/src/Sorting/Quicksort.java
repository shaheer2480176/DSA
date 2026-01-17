package Sorting;

import java.util.Arrays;

public class Quicksort {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            // Left half
            quickSort(arr, low, pi - 1);

            // Right half
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int idx = (low - 1);

        // Traverse elements and place smaller elements on left side
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                idx++;

                swap(arr, j, idx);
            }
        }

        // Place pivot at its correct position
        idx++;
        swap(arr, high, idx);

        return idx;
    }

    // Swap function
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}