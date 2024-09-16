import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0;
        boolean match = false;

        for(int i=0; i<=a.length(); i++){
            if(a.equals(b)) {
                match = true;
                break;
            }

            a = a.substring(1)+a.substring(0,1);
            cnt++;
        }

        System.out.print(match? cnt : -1);

    }
}