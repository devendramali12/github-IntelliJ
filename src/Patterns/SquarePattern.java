package Patterns;

public class SquarePattern {
    public static void main(String[] args) {

        int rn = 10, cn = 10;
        for (int r = 1; r <= rn; r++) {
            for (int c = 1; c <= cn; c++) {
                if (c == 1 || c == cn || r == 1 || r == rn) {
                    System.out.print("| ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
