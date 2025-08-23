package MethodtTypes.Typee4;

// Count even & Odd Number in Digits
public class Type4Example6 {
    public static int count(int a) {
        int even = 0;
        int odd = 0;
        while (a != 0) {
            int last = a % 10;
            if (last % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            a = a / 10;
        }
        System.out.println("Number Of Even Digits :- " + even);
        System.out.println("Number Of Odd digits :- " + odd);
        return even;
    }

    public static void main(String[] args) {
        count(1234);
        count(123456789);

    }
}
