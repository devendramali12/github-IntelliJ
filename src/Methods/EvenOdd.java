package Methods;

public class EvenOdd {
    public  static  void check(int num){
        if (num%2==0){
            System.out.println(num + " Is Even");
        }else {
            System.out.println(num + " Is Odd");
        }
    }
    public static void main(String[] args) {
        check(5);
        check(44);

    }
}
