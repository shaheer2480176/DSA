package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Basicsyntax {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements you want in the arraylist");
        n=sc.nextInt();

        ArrayList<Integer>hello=new ArrayList<Integer>();

        for (int rows = 0; rows <n   ; rows++) {
            hello.add(sc.nextInt());

        }
        for (int i = 0; i < n; i++) {
            System.out.println(hello.get(i));
        }
        hello.remove(2);
        System.out.println(hello);
        System.out.println(hello.contains(19));

        }
    }

