import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x;
        int sum = 0;

        for(int i=0; i<n; i++){
            x = sc.nextInt();
            if(x%2==1 && x%3==0) sum += x;
        }
        System.out.print(sum);
    }
}