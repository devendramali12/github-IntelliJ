package MethodtTypes.Typee2;

//Display Name Multiple Times
//Accept name and number of times to print it.
public class Type2Example4 {
    public static void name(String str, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(i+" " + str +" ");

        }
    }

    public static void main(String[] args) {
        name("Devendra",10);


    }
}
