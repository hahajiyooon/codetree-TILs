import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int idx = 0;
        int[] arr = new int[11];

        while(true){
            n = sc.nextInt();
            if(n == 0) break;

            arr[n/10]++;
        }

        for(int i=10; i>0; i--){
            System.out.println(10*i+" - "+arr[i]);
        }
    }
}