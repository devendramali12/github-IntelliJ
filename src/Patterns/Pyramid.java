package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int r = 1; r <= n; r++) {
            // Spaces
            for (int s = 1; s <= (n - r); s++) {
                System.out.print("  ");
            }
            //Star
            for (int k = 1; k <= ((2 * r) - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
