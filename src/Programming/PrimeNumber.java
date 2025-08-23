package Programming;

public class PrimeNumber {
    public static boolean Isprime(int num) {
        if (num < 1) {
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

        int n = 15;
        for (int i = 1; i <= n ; i++) {
            if (Isprime(i)){
                System.out.println(i + " Is a Prime");
            }

        }



    }
}
