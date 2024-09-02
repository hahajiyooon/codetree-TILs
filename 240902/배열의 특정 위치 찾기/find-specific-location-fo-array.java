import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sumE = 0;
        int sum3 = 0;
        int cnt = 0;

        for(int i=1; i<=10; i++){
            n = sc.nextInt();

            if(i%2 == 0){
                sumE += n;
            }

            if(i%3 == 0){
                sum3 += n;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sumE, (double)sum3/cnt);
    }
}