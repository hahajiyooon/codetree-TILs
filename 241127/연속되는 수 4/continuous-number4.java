import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, cnt = 0;
        int[] num = new int[1000];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(i>0 && num[i-1] < num[i]){
                cnt++;
            }else{
                cnt = 1;
            }

            ans = Math.max(ans,cnt);
        }

        System.out.print(ans);
    }
}