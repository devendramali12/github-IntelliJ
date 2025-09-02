package Arrays;

public class ArrayExample7 {
    public static void main(String[] args) {
        int arr[] = {20, 45, 60, 20, 11, 15, 58};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
