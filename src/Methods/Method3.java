package Methods;
//with return type without parameter
public class Method3 {
    public static  int babuRao(){
        return 150;
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println(babuRao());
        int ans = babuRao()+babuRao()+babuRao();
        System.out.println(ans);
        System.out.println("Main End");

    }
}
