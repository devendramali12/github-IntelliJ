package Practice_Pattern;

public class H1 {
    public static void main(String[] args) {
        int rn = 10, cn=10;

        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if (c==1|| c==cn|| r==1|| r==rn  || r==c || r+c==(rn+1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
