import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid = 0;

        if((a>b && a<c)||(a>c && a<b)){ mid = a; }
        if((b>a && b<c)||(b>c && b<a)){ mid = b; }
        if((c>b && c<a)||(c>a && c<b)){ mid = c; }

        System.out.println(mid);

    }
}