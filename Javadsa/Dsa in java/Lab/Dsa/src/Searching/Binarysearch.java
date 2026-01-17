package Searching;

public class Binarysearch{
public static int binarySearchRecursive(int[] arr, int low, int high, int target) {

    if (low > high) return -1;

    int mid = (low + high) / 2;

    if (arr[mid] == target) return mid;

    if (target < arr[mid])
        return binarySearchRecursive(arr, low, mid - 1, target);

    return binarySearchRecursive(arr, mid + 1, high, target);
}
    public static int binarySearchIterative(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == target) return mid;

            else if(target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
