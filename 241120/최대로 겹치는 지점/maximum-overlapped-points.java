import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1,x2;
        int[] stack = new int[101];

        for(int i=0; i<n; i++){
            x1 = sc.nextInt();
            x2 = sc.nextInt();

            for(int j=x1; j<=x2; j++){
                stack[j] ++;
            }
        }

        int max = 0;
        for(int i=0; i<100; i++){
            if(max < stack[i]) max = stack[i];
        }

        System.out.print(max);

    }
}