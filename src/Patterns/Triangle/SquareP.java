package Patterns.Triangle;

public class SquareP {
    public static void main(String[] args) {
        int rn = 11, cn = 11;
        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if (r==1|| r==rn || c ==1 || c==cn ){

                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
