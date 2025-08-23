package StringConcatenation;
//3️⃣ Using StringBuilder (Efficient in loops)
public class StringConcat3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" ");
        sb.append("Developer");
        sb.append(" Or ");
        sb.append(" What ");
        System.out.println("Using StringBuilder:- " + sb.toString() );

    }
    //✅ Best Practice: Use StringBuilder for heavy concatenation inside loops.
}
