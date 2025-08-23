package Programming;

public class AlphabetPrinter {
    public static void main(String[] args) {
        System.out.println("Uppercase A to Z");
        for (char c = 'A'; c <='Z' ; c++) {
            System.out.print(c +" ");

        }

        System.out.println("\n\nLowercase a to z");
        for (char c ='a'; c <='z' ; c++) {
            System.out.print(c + " ");

        }
    }
}
