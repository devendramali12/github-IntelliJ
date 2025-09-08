package Java_Part_1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "moam";
        String temp = str;
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
//        System.out.println("The Reverse String Is " + rev);
        if (rev.equals(temp)) {
            System.out.println("The Given String Is a Palindrome String");
        } else {
            System.out.println("The Given String Isn't a Palindrome String");
        }
    }
}
