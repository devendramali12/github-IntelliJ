package DecisionStatement;
//Switch with char – Vowel or Consonant
public class Switch2 {
    public static void main(String[] args) {
        char ch = 'e';
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonat");
        }

    }
}
