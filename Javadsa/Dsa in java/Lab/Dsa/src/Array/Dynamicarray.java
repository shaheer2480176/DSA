package Array;


class Dynamicarrayy{
    private int[]items;
    int count;

    public Dynamicarrayy(int length) {
        items=new int[length];
    }
    public void dynamicinsert(int value){
        if (count==items.length){
            int []newitems=new int[items.length*2];
            for (int i = 0; i < items.length; i++) {
                newitems[i]=items[i];
                items=newitems;
            }

        }
        items[count++]=value;
    }
    public void delete(int index){
        if (index<0||index>=count){
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < count-1; i++) {
            items[i]=items[i+1];
        }
        count--;

    }

}
