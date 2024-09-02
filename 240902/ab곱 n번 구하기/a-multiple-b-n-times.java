import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, mul;

        for(int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            mul = 1;

            for(int j=a; j<=b; j++){
                mul *=j;
            }
            System.out.println(mul);
        }
    }
}