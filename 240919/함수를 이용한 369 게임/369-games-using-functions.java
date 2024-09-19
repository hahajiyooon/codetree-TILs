import java.util.*;

public class Main {
    public static boolean tri(int n){
        boolean flag = false;

        if(n%3 == 0 || get369(n)){
            flag = true;
        }
        
        return flag;

    }

    public static boolean get369(int n){
        int tmp = n;

        while(tmp > 1){
            if(tmp%10 ==3 || tmp%10 ==6 || tmp%10 ==9){
                return true;
            }
            tmp /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(tri(i)) cnt++;
        }

        System.out.print(cnt);
    }
}