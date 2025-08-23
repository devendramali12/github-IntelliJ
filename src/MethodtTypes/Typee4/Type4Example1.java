package MethodtTypes.Typee4;
//Check Even or Odd
//Accept a number, return true if even, false if odd.
public class Type4Example1 {
    public  static  int oddeven(int a){
        if (a%2==0){
            System.out.println(a + " Is a Even Number");
        }else {
            System.out.println(  a+ " Is Odd Number");
        }
        return a;
    }
    public static void main(String[] args) {
        oddeven(5);
        oddeven(4);

    }
}
