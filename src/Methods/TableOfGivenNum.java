package Methods;

public class TableOfGivenNum {
    public  static  void table(int num){
        for (int i = 1; i <=10 ; i++) {
            int res = i*num;
            System.out.print(res + " ");

        } System.out.println();
    }
    public static void main(String[] args) {
        table(5);
        table(7);

    }
}
