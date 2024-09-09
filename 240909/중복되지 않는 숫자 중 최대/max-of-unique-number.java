import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[1000];
        int result = -1;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            cnt[arr[i]]++;
        }

        for(int i=999; i>-1; i--){
            if(cnt[i] == 1) {
                result = i;
                break;
            }
        }

        System.out.print(result == -1? -1 : result);
    }
}