package Programming;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ammount");
        int ammount = sc.nextInt();

        System.out.println("Enter the Day Consider Monday as 1");
        int day = sc.nextInt();




        switch(day){
            case 1,2,3,4,5: if (ammount<100){
                System.out.println(0.05*ammount);

            }else{
                System.out.println(0.10*ammount);
                break;

            }

            case 6,7 :
                System.out.println(0.15*ammount);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
