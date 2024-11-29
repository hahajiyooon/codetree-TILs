import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 0, t = 0;

        int[] a = new int[1001000];
        for(int i=0; i<n; i++){
            s = sc.nextInt();
            t = sc.nextInt();

            int timeA = 0;
            for(int j=1; j<=t; j++){
                a[timeA++] = j*s;
            }
        }//for

        int[] b = new int[1001000];
        for(int i=0; i<m; i++){
            s = sc.nextInt();
            t = sc.nextInt();

            int timeB = 0;
            for(int j=1; j<=t; j++){
                b[timeB++] = j*s;
            }
        }//for

        int cnt = 0;
        for(int i=1; i<1001000; i++){
            if(a[i]>b[i] && a[i-1]<b[i-1]){
                cnt++;
            }else if(a[i]<b[i] && a[i-1]>b[i-1]){
                cnt++;

            }
        }

        System.out.print(cnt+1);

    }
}