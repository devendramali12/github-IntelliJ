package Methods;

public class FactorialNumber {
    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial(5);
        factorial(1);
        factorial(0);


    }
}
