import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String result = "";

        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }

        result = Integer.toString(sum);
        result = result.substring(1)+result.substring(0,1);
        System.out.print(result);
    }
}