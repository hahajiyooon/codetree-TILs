import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n,  cnt;

        for(int i=0; i<m; i++){
            n = sc.nextInt();
            cnt = 0;

            while(n != 1){
                cnt++;
                
                if(n%2 == 0){
                    n /= 2;
                }else{
                    n = n*3+1;
                }
            }

            System.out.println(cnt);
        }


    }
}