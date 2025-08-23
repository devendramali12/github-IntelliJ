package Methods;

public class CountEvenOddNumber {
    public static void countchecker(int num) {
        int even = 0;
        int odd = 0;
        while (num != 0) {
            int last = num % 10;
            if (last % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println("Even Number :- " + even);
        System.out.println("Odd Number :- " + odd);

    }

    public static void main(String[] args) {
        countchecker(1234);

    }
}
