import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String tmp ;

        tmp = s;
        s = t;
        t = tmp;

        System.out.println(s+"\n"+t);
    }
}