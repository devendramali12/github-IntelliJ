package Loops;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The String:- ");
        String str = sc.next();

        String rev = "";

        for (int i = 0; i <str.length() ; i++) {
            rev = str.charAt(i)+ rev;

        }
        System.out.println(rev);

    }
}
