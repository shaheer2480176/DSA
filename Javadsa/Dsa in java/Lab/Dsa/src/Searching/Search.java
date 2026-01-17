package Searching;

public class Search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,910};
        int result=linearsearch(arr,8);
        System.out.println("Target found at index"+result);

    }
    static int linearsearch(int[]arr,int target){
        if (arr.length==0){
            return-1;
        }
        //forloop using
        for (int index = 0; index < arr.length; index++) {
           if (arr[index]==target){
               return index;
           }
        }
return -1;
    }
}
