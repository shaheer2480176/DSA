package Array;

import java.util.Arrays;

public class removeelementinarray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
       int []newarray= remove(arr,4);
        System.out.println(Arrays.toString(newarray));

    }
    static int[] remove(int[]arr,int element){
        int []array1=new int[arr.length-1];
        int index=0;
        for (int i = 0; i < arr.length ;i++) {
            if (arr[i]!=element){
                array1[index]=arr[i];
                index++;
            }

        }
        return array1;
    }
}
