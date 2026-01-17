package Array;

import java.util.Arrays;

public class Passingarrayinafunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void change(int arr[]){
        arr[0]=9;
    }

}
