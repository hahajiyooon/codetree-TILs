import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int sum = 0;
        int cnt = 0;
//7 
//8 > 1 2 4
        for(int i=s; i<=e; i++){
            sum = 0;
            for(int j=1; j<i; j++){
                if(i%j==0) sum += j;
            }
            if(sum == i) cnt++;
        }

        System.out.print(cnt);

    }
}