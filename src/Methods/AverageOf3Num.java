package Methods;

public class AverageOf3Num {

    public static void avg(double num1, double num2, double num3) {
        System.out.println("Avg Start");
        double res = num1 + num2 + num3;
        res = res / 3;
        System.out.println("Average Is :- " + res);
        System.out.println("Avg End");

    }

    public static void main(String[] args) {
        System.out.println("Main Start");

        avg(2, 20, 30);
        avg(2.35, 5.66, 8.36);
        System.out.println("Main End");

    }
}
