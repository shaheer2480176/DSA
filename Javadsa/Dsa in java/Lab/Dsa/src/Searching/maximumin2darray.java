package Searching;

public class maximumin2darray {
    public static void main(String[] args) {
        int[][] arr = {{5,3,4},{5,6,7},{7,8,9}};
        int maximum=maximum(arr);
        System.out.println("The maximum value in the 2d array is "+maximum);



    }
    static int maximum(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int columns = 0; columns < arr[rows].length; columns++) {
                if (arr[rows][columns]>max){
                    max=arr[rows][columns];
                }

            }
        }
        return max;

    }
}
