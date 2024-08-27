import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c = 0;

        for(int i=1; i<=n; i++){
            c = i;
            if(c%3==0) {
                System.out.print(0+" "); continue;
            }

            while(c != 0){
                if(c%10%3 == 0) {System.out.print(0+" "); break;}
                c /= 10;
            }
            System.out.print(i+" ");
        }
    }
}