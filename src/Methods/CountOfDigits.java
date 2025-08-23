package Methods;

public class CountOfDigits {
    public static void digits(int num) {
        int count = 0;
        if (num == 0) {
            count = 1;

        }

        while (num != 0) {
            int rev = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println( "Number Of Digits is :- " + count);
    }

    public static void main(String[] args) {
        digits(1234);
        digits(0);
        digits(-9856);

    }
}
