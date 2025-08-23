package Programming;

public class NoOfSmallCapitalLetter {
    public static void main(String[] args) {
        String str = "Tere Naam";
        int lcount = 0;
        int ucount=0;
        System.out.println(str.length());

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch >=65 && ch <=90){
                ucount++;
            }else if (ch >=90 && ch <=122){
                lcount++;
            }

        }
        System.out.println("Total Uppercase:- " +ucount);
        System.out.println("Total Lowercase:- " +lcount);
    }
}
