package Searching;

public class leetcode1295 {
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        int even=findNumber(arr);
        System.out.println("The code is "+even);

    }
    static int findNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigits=digit(num);
        return numberofdigits%2==0;

    }
    //count number of digit in a number
    static int digit(int num){
        int count=0;
        while (num>0){
            count++;
            num/=10;


        }
        return count;
    }

}
