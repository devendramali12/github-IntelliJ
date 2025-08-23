package Loops;

public class Q6 {
    public static void main(String[] args) {
        for (int i = 70; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }


        }
        System.out.println();
        System.out.println("----------------------------------");
        int a = 70;
        while (a <= 100) {
            if (a % 7 == 0) {
                System.out.print(a + " ");
            }a++;
        }
        System.out.println();
        System.out.println("---------------------------");
        int b = 70;
        do {
            if (b % 7 == 0) {
                System.out.print(b + " ");
            }
            b++;
        } while (b <= 100);
    }


}
