package Loops;
//To print  odd num from 70-50
public class Q3 {
    public static void main(String[] args) {
        for (int i = 70; i >=50 ; i--) {
            if (i%2!=0){
                System.out.println(i);
            }

        }
        System.out.println("-------------------------------------");

        int a = 70;
        while (a>=50){
            if (a%2!=0){
                System.out.println(a);
            }a--;
        }
        System.out.println("-------------------------");

        int b = 70;
        do {
            if (b%2!=0){
                System.out.println(b);
            } b--;
        }while (b>=50);



        
    }
}
