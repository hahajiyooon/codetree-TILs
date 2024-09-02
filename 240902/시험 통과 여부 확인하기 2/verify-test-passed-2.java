import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            sum = 0;
            flag = false;

            for(int j=0; j<4; j++){
                sum += sc.nextInt();
            }

            if(sum/4 >= 60){
                flag = true;
                cnt++;
            }

            System.out.println(flag? "pass" : "fail");
        }

        System.out.println(cnt);

    }
}