import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a+b;
        String ba = b+a;

        System.out.print(Integer.parseInt(ab)+Integer.parseInt(ba));

    }
}