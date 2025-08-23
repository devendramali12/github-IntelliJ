package Methods;

public class Domino {
    public static void area(double r) {
        System.out.println("Area() Start");
        double res = 3.142 * r * r;
        System.out.println("Area Of Pizza is :- " + res);
        System.out.println("Area () End");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        area(5);
        area(50);
        area(2.9);
        area(8.6);
        System.out.println("Main End");

    }
}
