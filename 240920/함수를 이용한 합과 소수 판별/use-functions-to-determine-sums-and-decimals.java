import java.util.*;

public class Main {
    public static boolean sumEven(int n){
        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        
        return (sum%2 == 0);
    }

    public static boolean decimal(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(decimal(i) && sumEven(i)){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}