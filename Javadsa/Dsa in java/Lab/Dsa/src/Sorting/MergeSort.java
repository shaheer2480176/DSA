package Sorting;

import java.util.Arrays;

public class MergeSort {

    // This function divides the array into smaller subarrays
    // using the Divide & Conquer approach (Merge Sort)
    public static void divide(int arr[], int si, int ei) {

        // Base case:
        // If the starting index is greater than or equal to ending index,
        // it means the array has 0 or 1 element, which is already sorted
        if (si >= ei) {
            return;
        }

        // Find the middle index to divide the array into two halves
        // This formula avoids integer overflow
        int mid = si + (ei - si) / 2;

        // Recursively divide the left half
        divide(arr, si, mid);

        // Recursively divide the right half
        divide(arr, mid + 1, ei);

        // Merge the two sorted halves
        conquer(arr, si, mid, ei);
    }


    // This function merges two sorted subarrays into one sorted array
    public static void conquer(int arr[], int si, int mid, int ei) {

        // Create a temporary array to store merged elements
        int merged[] = new int[ei - si + 1];

        // idx1 points to the start of the left subarray
        int idx1 = si;

        // idx2 points to the start of the right subarray
        int idx2 = mid + 1;

        // x is the index for the merged array
        int x = 0;

        // Compare elements from both subarrays
        // and store the smaller one into merged array
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements of left subarray (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements of right subarray (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged sorted elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};
        divide(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}