import java.util.*;
public class Main {
    public static int min(int a, int b, int c){
        int m = a;

        m = Math.min(a,b);
        m = Math.min(m,c);

        return m;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a,b,c));
    }
}