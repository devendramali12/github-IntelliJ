package Programming;

import java.util.Scanner;

/* Count the Number of Digits
Count how many digits are in the given number.
Input: 12345
Output: 5
 */
public class DigitCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int num = s.nextInt();

        int count = 0;

        if(num == 0){
            count = 1;
        }else {
            while (num!=0){
                num = num/10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
