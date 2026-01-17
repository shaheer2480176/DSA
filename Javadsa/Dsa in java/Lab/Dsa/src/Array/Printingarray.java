package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Printingarray {
    public static void main(String[] args) {
//        Forarray
//        int [] array=new int[5];
     Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter value for "+i+"Index");
//            array[i]=sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(array));
//        forstring
        String [] array=new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.next();


        }
        System.out.println(Arrays.toString(array));

    }
}
