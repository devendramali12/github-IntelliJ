package Practice;

public class IsPrime {
    public static boolean checkprime(int num) {
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
        int n = 5;
        checkprime(n);

        if (checkprime(n)) {
            System.out.println(n + " Is a Prime Number");
        } else {
            System.out.println(n + " Isn't a Prime Number");
        }

    }
}
