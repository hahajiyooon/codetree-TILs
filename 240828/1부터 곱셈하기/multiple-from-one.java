import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;

        for(int i=1; i<=n; i++){
            mul *= i;
            if(mul >= n){
                System.out.print(i);
                break;
            }
        }
    }
}