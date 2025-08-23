package Practice;

public class Fibooo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int num = 10;

        System.out.print(" 0 " + " 1 ");

        for (int i = 3; i <= num; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;


        }
    }
}
