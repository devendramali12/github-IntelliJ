package StringConcatenation;
//Using String.join() (For joining with delimiter)
public class StringConcat5 {
    public static void main(String[] args) {
        String result = String.join(" - " , "Java","Python","C++");
        System.out.println("Joined String: " + result );

    }
}
//🧠 Useful when joining arrays or list of strings with separators.