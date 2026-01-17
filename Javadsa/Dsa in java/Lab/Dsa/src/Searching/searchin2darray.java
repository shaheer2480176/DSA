package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = {{2,3,4},{5,6,7},{7,8,9}};
        System.out.println("Enter the number you want to search");
        int target= sc.nextInt();
        int[] found=search(arr,target);
        System.out.println(Arrays.toString(found));

    }
    static int[] search(int [][]arr,int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int column = 0; column < arr[rows].length; column++) {
                if (arr[rows][column]==target){
                    return new int[]{rows,column};
                }

            }

        }

        return new int []{-1,1};
    }
}
