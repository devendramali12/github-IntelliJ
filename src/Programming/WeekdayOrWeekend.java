package Programming;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a the number:-");
        int a = sc.nextInt();

        switch (a){
            case 1, 2, 3, 4, 5, 6 -> {
                System.out.println("Weekday");
            }

        case 8,9 -> {
            System.out.println("Weekend");
        }
            default -> System.out.println("Invalid Input");

        }
    }
}
