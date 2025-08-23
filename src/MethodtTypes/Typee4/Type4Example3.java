package MethodtTypes.Typee4;
//Check Palindrome String
//Accept a string, return true if palindrome.
public class Type4Example3 {
    public  static String palindrome(String str){
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev+str.charAt(i);

        }
        System.out.println(rev);
        return rev;
    }
    public static void main(String[] args) {
        palindrome("mom");

    }
}
