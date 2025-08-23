package Loops;

public class Whitepasta {
    public static void main(String[] args) {
        String str = "Pink    Pasta    @@    877";
        int wCount;

        if (str.charAt(0) != ' ') {
            wCount = 1;
        } else {
            wCount = 0;
        }

        System.out.println("String length: " + str.length());

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                wCount++;
            }
        }

        System.out.println("Total words: " + wCount);
    }
}
