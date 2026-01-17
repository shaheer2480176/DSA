package array2dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class inputin2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        //input
        for (int rows = 0; rows < arr.length; rows++) {
            for (int columns = 0; columns < arr.length; columns++) {
                arr[rows][columns]=sc.nextInt();
            }
        }
        //printing the array
        for (int [] row:arr){
            System.out.println(Arrays.toString(row));
        }

            }
        }

