import java.util.*;

public class Main {
    public static String YesOrNo(int n){
        boolean flag = false; 
        int sum = 0;

        if(n%2 == 0){
            sum += n%10;
            sum += n/10;
            
            if(sum%5 == 0){
                flag = true;
            }
        }

        return (flag)? "Yes" : "No";
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(YesOrNo(n));

    }
}