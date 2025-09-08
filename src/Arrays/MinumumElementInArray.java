package Arrays;

public class MinumumElementInArray {
    public static void main(String[] args) {
        int[] arr = {20, 45, 63, 10, 12, 44, 52, 22, 30};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The Smallest Element In Array Is :- " + min);
    }
}
