import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.print(s1.length() > s2.length()?
                                s1+" "+s1.length() : s2+" "+s2.length());        
    }
}