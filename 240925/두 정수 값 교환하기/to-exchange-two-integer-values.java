import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = 0;

        tmp = n;
        n = m;
        m = tmp;

        System.out.printf("%d %d",n,m);
    }
}