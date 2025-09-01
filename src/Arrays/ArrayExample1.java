package Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr; // 1 --> Array Declaration

        arr = new int[6]; // 2--> Array Creation

        int[] gd = new int[6];  //3 --> Array Declaration And Creation

        System.out.println(gd[0]);
        System.out.println(gd[1]);
        System.out.println(gd[2]);
        System.out.println(gd[3]);
        System.out.println(gd[4]);
        System.out.println(gd[5]);

        System.out.println("-----------------------------------------------------------------------");

        gd[0] = 10;  // 4 --> Array Initialization
        gd[3] = 17;
        gd[5] = 69;
        System.out.println(gd[0]);
        System.out.println(gd[1]);
        System.out.println(gd[2]);
        System.out.println(gd[3]);
        System.out.println(gd[4]);
        System.out.println(gd[5]);
    }
}
