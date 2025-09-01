package Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        String[] name; // 1-->  Array Declaration

        name = new String[4]; // 2 --> Array Creation

        String[] Name = new String[4];  // 3 --> Array Declaration and creation
        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
        System.out.println(Name[3]);

        System.out.println("---------------------------------------------------------------------");

        Name[0] = "Devendra";
        Name[1] = "Bala";
        Name[2] = "Babu";
        System.out.println(Name[0]);
        System.out.println(Name[1]);
        System.out.println(Name[2]);
        System.out.println(Name[3]);


    }
}
