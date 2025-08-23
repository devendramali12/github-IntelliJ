package Programming;
//print alphabets using their ASCII (Unicode) values
public class AsciiAlphabetPrinter {
    public static void main(String[] args) {
        System.out.println("Uppercase A to Z: ");
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)i + " ");

        }
        System.out.println("\n\nLowercase a to z: ");
        for (int i = 97; i <= 122 ; i++) {
            System.out.print((char)i + " ");

        }
    }

}
