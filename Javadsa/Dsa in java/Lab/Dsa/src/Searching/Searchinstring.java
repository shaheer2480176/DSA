package Searching;

public class Searchinstring {
    public static void main(String[] args) {
        String name="shaheer";
        char target='a';
        boolean index=(search(name,target));
        System.out.println("The targeted alphabet found at "+index); 


    }
    static boolean search(String str,char target){
        if (str.length()==0){
            return false;

        }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i))
            return true;
        }

return false;
    }

}
