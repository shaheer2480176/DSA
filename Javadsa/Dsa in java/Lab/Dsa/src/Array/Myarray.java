package Array;

import java.util.Arrays;

public class Myarray {
    private int []items;
    private int count;

    public Myarray(int length) {
        items=new int[length];
    }
    public void insert(int value){
        if (count==items.length){
            System.out.println("Array is full!!!!!!!");
            return;
        }
        System.out.println("Element inserted at index"+count);
        items[count++]=value;

    }
    public void printarray(){
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" ");
        }
        System.out.println();




    }
}
class Main{
    public static void main(String[] args) {
     Myarray num=new Myarray(5);
     num.insert(10);
        num.insert(10);
        num.insert(10);
        num.insert(10);
        num.insert(10);
        num.insert(10);
        num.printarray();
    }
}
