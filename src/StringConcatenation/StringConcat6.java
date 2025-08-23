package StringConcatenation;
//Using String.format()
public class StringConcat6 {
    public static void main(String[] args) {
        String language = "Java";
        String level = "Advanced";
        String result = String.format("%s is an %s Language ", language,level);
        System.out.println("Formatted String: " + result ) ;

    }
}
//🧠 Note: Great for formatted output in logging or UI.