package Java_Part_1.Conditional_Operator;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 20;
        String res = (age >= 18) ? "Eligible To Vote" : "Not Eligible To Vote";
        System.out.println(age + " Is " + res);
    }
}
