package Programming;

import java.util.Scanner;

//Input a character and check if it is a vowel or consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:- ");
        char ch = sc.next().charAt(0); // reads the first character

        // Convert to Lowercase to ignore case
        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)){
            System.out.println("Invalid input.Please enter a letter.");

        } else if (ch=='a' || ch == 'e' || ch =='i' ||ch == 'o'||ch=='u') {
            System.out.println(ch + " Is a Vowel.");
        }else {
            System.out.println(ch + " Is a Consonat");
        }
    }
}
