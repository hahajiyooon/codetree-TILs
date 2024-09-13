import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int endIdx = (n < str.length())? str.length()-1 : -1;

        for(int i=endIdx; i>endIdx-n; i--){
            System.out.print(str.charAt(i));
        }
    }
}