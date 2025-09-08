package Arrays;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = {20, 25, 65, 85, 630, 62, 41, 20};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The Maximum Element In a Array Is:- " + max);
    }
}
