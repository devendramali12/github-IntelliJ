package StringConcatenation;
//2️⃣ Using concat() Method
public class StringConcat2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(" ").concat(str2);
        System.out.println("Result:- " + result);
    }
}
//Note: concat() is a method of the String class.