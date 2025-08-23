package StringConcatenation;
//Using StringBuffer (Thread-Safe Version of StringBuilder)
public class StringConcat4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Multi");
        sb.append(" Threading");
        System.out.println("Using StringBuffer: " + sb.toString());
    }
}
//Note: Use StringBuffer when working in multi-threaded environments.