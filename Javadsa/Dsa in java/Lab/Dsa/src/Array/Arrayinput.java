package Array;

import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array=new int[5];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter your "+i+" Element");
            array[i]=sc.nextInt();

        }
        for(double num:array){
            System.out.println(num);

        }
    }
}
