package Array;

import java.util.Arrays;

public class leetcode1480 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        arr2[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr2[i]=arr2[i-1]+arr[i];

        }
        System.out.println(Arrays.toString(arr2));

    }
}

