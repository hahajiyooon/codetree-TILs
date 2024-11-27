import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int [] num = new int[1000];
        int ans = 0, cnt = 0, zero = 0;
        boolean underT = false;

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(num[i] > t){
                cnt = (underT)? 1 : cnt+1;
                underT = false;
            }else{
                cnt = 1;
                zero++;
                underT = true;
             }

            ans = Math.max(ans, cnt);
        }
        
        //
        System.out.print((zero == n)? 0 : ans);

    }
}