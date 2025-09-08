package Practice;

public class Fibba {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int temp = 10;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= temp; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
    }
}
