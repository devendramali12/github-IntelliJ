package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {45, 20, 15, 70, 60, 30, 90, 75, 23, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Key Element to find Index");
        int key = sc.nextInt();
        int res = linearsearch(arr, key);

        if (res != -1) {
            System.out.println(key + " Is Present In Index " + res);
        } else {
            System.out.println(key + " Doesn't Exist");
        }

    }
}
