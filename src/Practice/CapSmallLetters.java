package Practice;

public class CapSmallLetters {
    public static void main(String[] args) {

        String str = "DeVendra";
        int cap = 0;
        int small = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                cap++;
            } else if (ch >= 90 && ch <= 122) {
                small++;
            }

        }
        System.out.println("The Capital Letter :- " + cap);
        System.out.println("The Small Letter :- " + small);
    }
}
