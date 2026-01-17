package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayprint {
    public static void main(String[] args) {
        int []arr=new int[5];

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input\t"+i+"\tElement");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
