import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<10; i++){
            n = sc.nextInt();

            if(n >= 250){break;}
            sum += n;
            cnt++;
        }

        System.out.print(sum+" "+(double)sum/cnt);
    }
}