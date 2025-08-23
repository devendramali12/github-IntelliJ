package Methods;

public class SumOfNNaturalNum {
    public static void sum(int num) {
        int res = (num * (num + 1)) / 2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        sum(5);
        sum(10);

    }
}
