import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] mul = new int [1000];
        int idx = 0;

        while(n > 0){
            mul[idx++] = n%b;
            n /= b;
        }

        for(int i=idx-1; i>=0; i--){
            System.out.print(mul[i]);
        }
        
    }
}