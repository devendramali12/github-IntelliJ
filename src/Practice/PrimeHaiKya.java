package Practice;

public class PrimeHaiKya {
    public static boolean primehai(int num) {
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
        int n = 7;

        if (primehai(n)) {
            System.out.println(n + " Is a Prime ");
        } else {
            System.out.println(n + " Isn't a Prime");
        }

    }
}
