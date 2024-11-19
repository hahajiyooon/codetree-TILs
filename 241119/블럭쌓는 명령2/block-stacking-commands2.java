import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sum = new int[n+1];
        int s,e;

        for(int i=0; i<k; i++){
            s = sc.nextInt();
            e = sc.nextInt();

            for(int j=s; j<=e; j++){
                sum[j]++;
            }
        }

        Arrays.sort(sum);

        System.out.print(sum[n]);
    }
}