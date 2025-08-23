package DecisionStatement;

import java.util.Scanner;

//Check whether a character is a vowel or consonant
public class VovelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character:- ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch>='a'&& ch<='z'){
            if (ch == 'a' || ch == 'e'|| ch =='i'|| ch=='o'|| ch=='u'){
                System.out.println(ch + "Is a Vowel");
            } else {
                System.out.println(ch + "is a Consonat");
            }


        }else {
            System.out.println("Invali Input ! Please enter an alphabet");
        }


    }
}
