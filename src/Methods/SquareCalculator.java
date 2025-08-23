package Methods;

public class SquareCalculator {
    public static void square(int num) {
        int res = num * num;
        System.out.println(num);
        System.out.println("Square Is :- " + res);
        System.out.println();

    }

    public static void main(String[] args) {
        square(5);
        square(9);

    }
}
