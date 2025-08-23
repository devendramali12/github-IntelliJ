package StringConcatenation;
//1️⃣ Using + Operator (Most Common)

public class StringConcat1 {
    public static void main(String[] args) {
        String firstName = "Devendra";
        String lastName = "Mali";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name:- " + fullName );
        System.out.println("Full Name:- " + firstName +" "+ lastName);
    }
}
