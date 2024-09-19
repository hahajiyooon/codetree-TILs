import java.util.*;

public class Main {
    public static int sum(int a, int b){
        boolean decimal = true;
        int s = 0;

        if(b == 1) return 0;

        for(int i=a; i<=b; i++){
            decimal = true;

            for(int j=2; j<i; j++){
                if(i%j == 0) {
                    decimal = false; 
                    break;
                }
            }
            if(decimal) s += i;
        }

        return s;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sum(a,b));
    }
}