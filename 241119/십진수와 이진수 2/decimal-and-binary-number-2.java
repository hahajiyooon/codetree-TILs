import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int r = 1;

        while(n > 0){
            decimal += n%10*r;
            r *= 2;
            n /= 10;
        }

        decimal *= 17;

        int[] result = new int[1000];
        int idx = 0;
        while(decimal > 0){
            result[idx++] = decimal%2;
            decimal /= 2;
        }

        for(int i=idx-1; i>=0; i--){
            System.out.print(result[i]);
        }

    }
}