package MethodtTypes;

public class T4 {
    public static int cube(int a) {
        int res = a * a * a;
        System.out.println("Cube Is :- " + res);
        return res;
    }

    public static void main(String[] args) {
        cube(5);
        cube(3);
    }
}
