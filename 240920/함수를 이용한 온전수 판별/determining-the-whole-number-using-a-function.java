import java.util.*;

public class Main {
    public static boolean numberOn(int n){
        
        if(n%2 != 0 && n%10 != 5 && !(n%3 == 0 && n%9 != 0)) {
           // System.out.println(n);
            return true;
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
            if(numberOn(i)) cnt++;
        }

        System.out.print(cnt);

    }
}