package Patterns;

public class UltaTriangle {
    public static void main(String[] args) {
        int n = 9;
        for (int r = n; r >= 1; r--) {


            //Spaces
            for (int s = 1; s <= (n - r); s++) {
                System.out.print("  ");

            }

            //Star
            for (int k = 1; k <= (2 * r - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
