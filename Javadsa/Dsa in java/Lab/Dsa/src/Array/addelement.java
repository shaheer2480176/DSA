package Array;

public class addelement {
    public static void main(String[] args) {
        int []arr={1,2,33,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("The sum is\t"+sum);
    }
}
