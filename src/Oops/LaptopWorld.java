package Oops;

class laptop {
    String brand = "Dell";
    int Ram = 8;
    int ssd = 256;
}

public class LaptopWorld {
    public static void main(String[] args) {
        System.out.println("LW Start");
        laptop l1 = new laptop(); // --> Object 1
        l1.brand = "HP";
        System.out.println(l1.brand); //: brand Dell --> HP
        System.out.println(l1.Ram);
        System.out.println(l1.ssd);
        System.out.println("-------------------------------");

        laptop l2 = new laptop();
        l2.ssd = 512;
        System.out.println(l2.brand);
        System.out.println(l2.Ram);
        System.out.println(l2.ssd); // ssd 256 --> 512
        System.out.println("---------------------------------");

        laptop l3 = new laptop();
        l3.Ram = 16;
        System.out.println(l3.brand);
        System.out.println(l3.Ram);
        System.out.println(l3.ssd);

        System.out.println("LW End");
    }
}
