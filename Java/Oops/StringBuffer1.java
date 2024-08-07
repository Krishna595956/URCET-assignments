package Java.Oops;
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.charAt(2));
        sb.append(" world");

        sb.insert(11, " greetings");
        // System.out.println(sb);

        sb.replace(6, 11, "everyone");
        System.out.println(sb);

        System.out.println(sb.reverse()==sb);

    }
}
