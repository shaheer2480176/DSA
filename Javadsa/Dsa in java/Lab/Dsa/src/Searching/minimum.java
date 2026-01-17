package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        int []arr=new int[10];
        //input user
        Scanner sc=new Scanner(System.in);
        for (int index = 0; index <arr.length ; index++) {
            arr[index]=sc.nextInt();

        }
        //printing array
        System.out.println(Arrays.toString(arr));


        //finding minimum number
        int min=arr[0];
        for (int index = 1; index <arr.length ; index++) {
            if (arr[index]<min)
                min=arr[index];

        }
        System.out.println("Minimum number in array is "+min);
    }
}
//finding minimum number