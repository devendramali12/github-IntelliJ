package MethodtTypes.Typee4;

public class Type4Example7 {
    public static double avg(double a, double b, double c, double d, double e) {
        double res = a + b + c + d + e;
        res = res / 5;
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        double avgerage = avg(55, 86, 78, 55, 99);

        if (avgerage < 40) {
            System.out.println("Below Average" + avgerage);
        } else if (avgerage >= 40 && avgerage <= 70) {
            System.out.println("Avergae" + avgerage);

        } else {
            System.out.println("Extra Ordinary  " +
                    "" + avgerage);
        }

    }
}
