import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, ans = 0;
        int[] stack = new int[1000];

        for(int i=0; i<n; i++){
            stack[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(i > 0 && stack[i]*stack[i-1] > 0){
                cnt++;
            }else{
                cnt = 1;
            }

            ans = Math.max(ans,cnt);
        }

        System.out.print(ans);
        
    }
}