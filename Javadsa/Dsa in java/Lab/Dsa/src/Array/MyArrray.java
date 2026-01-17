package Array;

class array{
    private int [] items;
    int count;

    public array(int length) {
        items=new int[length];
    }
    public void insert(int value){
        if (count==items.length){
            System.out.println("ARRAY IS FUll");
        }
        items[count++]=value;

    }
    public void printarray(){
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }
}
public class MyArrray {
    public static void main(String[] args) {
        array arr=new array(5);
        arr.insert(15);
        arr.insert(4);
        arr.printarray();
    }
}