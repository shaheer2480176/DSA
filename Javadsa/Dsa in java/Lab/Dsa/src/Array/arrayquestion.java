package Array;

import java.util.Scanner;

public class arrayquestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]array=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element :");
            array[i]=sc.nextInt();
        }
        int sum=0;
        int max=array[0];
        for (int i = 0; i < n; i++) {
            sum+=array[i];
            if(array[i]>max){
                max=array[i];
            }



        }
    }
}
