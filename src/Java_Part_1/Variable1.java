package Java_Part_1;
// ---> Case 1

public class Variable1 {
    public static void main(String[] args) {
        int a = 10;  // Local Variable
        System.out.println(a);
        {
            int b = 50;
            System.out.println(b);
            System.out.println(a);
        }
        int b = 45;
        System.out.println(b);
    }
}
