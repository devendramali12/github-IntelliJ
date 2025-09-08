package Java_Part_1.Conditional_Operator;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " Is " + result);
    }
}
