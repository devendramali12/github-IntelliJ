package Programming;

import java.util.Scanner;

//Number Pattern – Right Angle Triangle
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        //outer loop for rows
        for (int i = 1; i <=n ; i++) {
        // inner loop to print numbers from 1 to i
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
