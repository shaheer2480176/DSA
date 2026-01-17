package Array;
import java.util.Arrays;

public class maxofanarray {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5,6};
        int max= max(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The largest element is "+max);
    }
    static int max(int []arr){
        int maximum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}



