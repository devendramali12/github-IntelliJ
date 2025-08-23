package Patterns.Triangle;

public class RightPascal {
    public static void main(String[] args) {
        int rn = 5, cn = 5;
        // upper part
        for (int r = 1; r <= rn; r++) {
            for (int c = 1; c <= cn; c++) {
                if (c <= r) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // lower part
        for (int r = rn - 1; r >= 1; r--) {
            for (int c = 1; c <= cn; c++) {
                if (c <= r) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

