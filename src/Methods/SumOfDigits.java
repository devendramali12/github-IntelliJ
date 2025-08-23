package Methods;

public class SumOfDigits {
    public static void sum(int num) {
        int summ = 0;
        while (num != 0) {
            int last = num % 10;
            summ = summ + last;
            num = num / 10;

        }
        System.out.println("Sum Of Digits is " + summ);
    }

    public static void main(String[] args) {
        sum(1234);
        sum(2451);

    }
}
