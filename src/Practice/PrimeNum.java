package Practice;

public class PrimeNum {
    public static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int n = 11;

        if (isprime(n)) {
            System.out.println(n + " is a prime");
        } else {
            System.out.println(n + " is not prime");
        }


    }
}
