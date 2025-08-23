package Programming;

import java.util.Scanner;

public class FrogQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance(in meter) :");
        int  distance = sc.nextInt()*100;


        int hopping = 25;

        int hops = distance / hopping; // number of hops

        // d = 123
        // hops 1-->25,2-->50,3-->75,4-->100,5-->123

        hops +=(distance % 25 == 0)? 0:1;
        System.out.println(hops);


    }
}
