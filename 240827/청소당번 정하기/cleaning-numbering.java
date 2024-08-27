import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntK = 0;
        int cntB = 0;
        int cntW = 0;

        for(int i=2; i<=n; i++){
            if(i%12 == 0){
                cntW++;
            }else if(i%3 == 0){
                cntB++;
            }else if(i%2 == 0){
                cntK++;
            }
        }

        System.out.print(cntK+" "+cntB+" "+cntW);

    }
}