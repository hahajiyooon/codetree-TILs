import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, sum;

        for(int i=0; i<n; i++){
            sum = 0;
            a = sc.nextInt();
            b = sc.nextInt();

            for(int j=a; j<=b; j++){
                if(j%2 == 0) sum += j;
            }
            
            System.out.println(sum);
        }
    }
}