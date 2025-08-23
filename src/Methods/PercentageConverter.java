package Methods;

public class PercentageConverter {

    public static void per(double Sub1, double Sub2, double Sub3, double Sub4, double Sub5) {
        double res = Sub1 + Sub2 + Sub3 + Sub4 + Sub5;
        res = res / 500 * 100;
        System.out.println("Percentage Is :- " + res);
    }

    public static void main(String[] args) {
        per(25, 23, 58, 52, 62);
        per(25, 66.96, 89.36, 89.25, 89.99);

    }
}
