import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int cnt = 0;

        while(sum>0){
            
            if(sum%10 == 1){
                cnt++;
            }

            sum /=10;
        }

        System.out.print(cnt);

    }
}