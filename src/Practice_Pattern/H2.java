package Practice_Pattern;

public class H2 {
    public static void main(String[] args) {
        int rn = 5 , cn = 5;

        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if (c%2==0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
