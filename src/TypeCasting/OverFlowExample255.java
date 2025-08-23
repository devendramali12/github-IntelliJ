package TypeCasting;

public class OverFlowExample255 {
    public static void main(String[] args) {

        int large = 255;
        byte b = (byte) large;
        System.out.println("Original int :- " + large);
        System.out.println("After casting to byte :- " + b);
    }
}
