package Sorting;
class Sorting{
    public void bubblesort(int[]array){
        for (int i = 0; i < array.length-1; i++) {//
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }
    }
    public void Selectionsort(int[]array){
        for (int i = 0; i <array.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[min]>array[j]){
                    min=j;
                }


            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;


        }

    }


}