import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        //홀번째는 1씩 증가
        //짝번째는 2씩 증가

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                cnt += (i%2 == 0)? 1: 2;
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
    }
}