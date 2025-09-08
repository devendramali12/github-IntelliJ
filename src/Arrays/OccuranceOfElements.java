package Arrays;

public class OccuranceOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 5, 4, 2, 36, 8, 7, 9, 8, 5, 2, 2, 2, 1, 8};
        int key = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(count);
    }

}
