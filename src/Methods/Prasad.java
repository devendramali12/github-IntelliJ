package Methods;

public class Prasad {
    public static void chotu(int a, int b) {
        System.out.println("Chotu Start");
        int ans = a + b;
        System.out.println("Sum is :- " + ans);
        System.out.println("Chotu End");

    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        chotu(15, 50);
        System.out.println("-----------------------");
        chotu(22, 55);
        System.out.println("------------------------");
        chotu(22, 10);
        System.out.println("Main End");

    }
}
