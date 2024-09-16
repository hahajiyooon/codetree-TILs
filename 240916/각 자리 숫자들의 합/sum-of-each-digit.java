import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            sum += Integer.parseInt(str.substring(i,i+1));
        }

        System.out.print(sum);
    }
}