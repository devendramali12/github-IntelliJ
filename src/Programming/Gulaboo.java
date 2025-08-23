package Programming;

public class Gulaboo {
    public static void main(String[] args) {
       int Ucount=0;
       int Lcount = 0;
       String str = "Ramesh";
        System.out.println(str.length());

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if (ch >=65 && ch<=90){
                Ucount++;
            }else if (ch >=90 && ch<=122){
                Lcount++;
            }

        }
        System.out.println("Lowercase =  "+ Lcount);
        System.out.println("Uppercase =  " + Ucount);
    }
}
