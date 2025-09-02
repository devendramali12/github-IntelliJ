package Arrays;

public class ArrayExample9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {   // check odd index
                sum += arr[i];
            }
        }

        System.out.println("Sum of elements at odd index positions: " + sum);
    }
}
