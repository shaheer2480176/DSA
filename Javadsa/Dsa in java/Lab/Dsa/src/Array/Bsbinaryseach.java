package Array;

public class Bsbinaryseach {
    public static void main(String[] args) {
        int[]array={1,4,9,16,25,36,49,64,81,100};
         Search s1=new Search();
        int index= s1.binaryseach(array,100,0,array.length-1);
        if (index==-1){
            System.out.println("Element Not found");
        }else {
            System.out.println("Element found at index"+index);
        }





    }

}
class Search{
//    public int binarysearch(int [] arr,int search){
//        int low=0;//low first value
//        int high=arr.length-1;//high being last value
//        int mid;
//
//        while (low<=high){
//            mid=(low+high)/2;//for mid value
//            if (arr[mid]==search){
//                return mid;
//            } else if (arr[mid]<search) {
//                low=mid+1; //it is going for elements after mid
//
//            }else {
//                high=mid-1;  //it is going for other elements before mid
//            }
//
//
//        }
//        return -1;//case for not finding
//    }
    public int binaryseach(int[]array,int search,int low,int high){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (array[mid]==search){
            return mid;
        }
        if (array[mid]<search){
            return binaryseach(array,search,mid+1,high);
        }
        if (array[mid]>search){
            return binaryseach(array,search,low,mid-1);
        }

return -1;

    }
}

