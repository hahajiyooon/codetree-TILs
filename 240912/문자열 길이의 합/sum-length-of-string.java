import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str ;
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            str = sc.next();
            sum += str.length();
            if(str.charAt(0) == 'a') cnt++;
        }

        System.out.printf("%d %d",sum,cnt);

    }
}