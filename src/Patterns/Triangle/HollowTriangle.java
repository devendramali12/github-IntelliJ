package Patterns.Triangle;

public class HollowTriangle {
    public static void main(String[] args) {
        int rn = 5;
        int cn = 5;
        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if (c==1|| r==c|| r==rn){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
