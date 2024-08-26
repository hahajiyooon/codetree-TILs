import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String sex1 = sc.next();
        int age2 = sc.nextInt();
        String sex2 = sc.next();

        System.out.println((age1>18 && sex1.equals("M")) 
        || (age2>18 && sex2.equals("M"))? 1 : 0);

    }
}