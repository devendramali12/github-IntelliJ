package Loops;
//WAP num divisible by 4 from 0-50
public class Q2 {
    public static void main(String[] args) {

        for (int i = 0; i <=50 ; i++) {
            if(i%4==0){
                System.out.println(i);
            }

        }
        System.out.println("--------------------------------------------");
        int a = 0;
        while (a<=50){
            if (a%4==0){
                System.out.println(a);
            }a++;
        }
        System.out.println("--------------------------------------------------------------------------");
        int b = 0 ;
        do {
            b=b+4;
            System.out.println(b);


        }while (b<=50);

    }
}
