package Loops;
//Wap even num from 40-60
public class Q1 {
    public static void main(String[] args) {
        int n = 40;

        do {
            System.out.println(n);
            n+=2;
        }while (n<=60);
        System.out.println("---------------------------------------------------------------------------------");
        int a = 40;
        while (a<=60){
            System.out.println(a);
            a+=2;
        }
        System.out.println("-----------------------------------------------------------------------------------");
        int b = 40;
        for (b =40; b<=60; b++){

            if (b%2==0){
                System.out.println(b);
            }
        }

    }
}
