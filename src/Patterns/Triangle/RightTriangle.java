package Patterns.Triangle;

public class RightTriangle {
    public static void main(String[] args) {
        int rn = 5, cn = 5;
        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if (c<=r){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
