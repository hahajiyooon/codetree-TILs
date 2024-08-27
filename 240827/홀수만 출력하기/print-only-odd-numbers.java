import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int n = 0;

        for(int i=0; i<cnt; i++){
            n = sc.nextInt();
            if(n%2==1 && n%3==0){
                System.out.println(n);
            }
        }
    }
}