package TypeCasting;

public class OverFlowExampleMinus130 {
    public static void main(String[] args) {
        int large = -130;
        byte b = (byte) large;

        System.out.println("Original int:- " + large );
        System.out.println("After casting to byte :- " + b);
    }
}
