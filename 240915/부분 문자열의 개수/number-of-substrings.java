import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String sub = sc.next();
        int cnt = 0;

        for(int i=0; i<input.length()-1; i++){
            if(input.substring(i,i+2).equals(sub)) cnt++;
        }
        System.out.print(cnt);
    }
}