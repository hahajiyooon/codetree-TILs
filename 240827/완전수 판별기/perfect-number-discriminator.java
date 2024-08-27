import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        boolean flag = false;

        for(int i=1; i<n; i++){
            if(n%i==0) sum += i;
        }

        if(sum == n) flag = true;

        System.out.print(flag? "P" : "N");


    }
}