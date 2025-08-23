package DecisionStatement;
// Switch with String – Fruit Category
public class Switch4 {
    public static void main(String[] args) {
        String fruit = "Apple";
        switch (fruit.toLowerCase()){
            case "apple":
            case "banana":
            case "orange":
                System.out.println("Its a fruit");
                break;
            case "carrot":
            case "broccoli":
                System.out.println("Its a vegetable");
                break;
            default:
                System.out.println("Unkonwn Text");
        }
    }
}
