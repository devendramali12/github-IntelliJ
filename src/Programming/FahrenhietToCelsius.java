package Programming;
import java.util.*;

public class FahrenhietToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Conversion formula
        double celsius = (5.0/9.0) * (fahrenheit - 32);

        // output result
        System.out.println("temperature in celsius : " + celsius);

        sc.close();
    }
}
