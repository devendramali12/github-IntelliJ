package Loops;
// Print Num from 90-80 in reverse order
public class Q5 {
    public static void main(String[] args) {
        int a =80;
        for (a = 80; a<=90; a++){
            System.out.print(a+ " ");

        }
        System.out.println();
        System.out.println("-----------------------------");
        int b = 80;
        while (b<=90){
            System.out.print(b + " ");
            b++;
        }
        System.out.println();
        System.out.println("-----------------------------");

        int c= 80;
        do {
            System.out.print(c + " ");
            c++;
        }while (c<=90);

    }
}
