import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        int min = n; 

        while(true){
            n = sc.nextInt();
            if(n == 999 || n == -999) break;

            if(min > n) min = n;
            if(max < n) max = n;
        }

        System.out.printf("%d %d",max,min);
    }
}