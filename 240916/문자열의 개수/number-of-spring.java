import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input ;
        int cnt = 0;
        String result = "";

        while(true){
            input = sc.next();

            if(input.equals("0")) break;

            cnt++;
            if(cnt%2 == 1)
            result += input+"\n";

        }

        System.out.println(cnt);
        System.out.println(result);
    }
}