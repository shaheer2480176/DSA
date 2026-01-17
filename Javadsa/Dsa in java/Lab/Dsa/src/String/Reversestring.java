package String;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a String to reverse");
        String name=sc.next();
        int len=name.length();
        String reversename="";
        for (int i = 0; i < name.length(); i++) {
            reversename=reversename+name.charAt(len-1);
            len--;

        }
        System.out.println("String before"+name);
        System.out.println("String after"+reversename);
    }
}
