import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int r = 1;

        while(true){
            if(n < 1){
                break;
            }
            sum += n%10*r;
            r *= 2;
            n /= 10;
        }

        System.out.print(sum);
    }
}