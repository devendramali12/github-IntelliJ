package TypeCasting;

public class CharToIntExample {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch ;
        char newChar = (char)(ascii + 1);

        System.out.println("Char: " + ch);
        System.out.println("ASCII: "+ ascii);
        System.out.println("Next Char: " + newChar);
    }
}
