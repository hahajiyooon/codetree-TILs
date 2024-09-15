import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int leng = str.length();

        System.out.print(str.substring(0,1)+str.substring(2,leng-2)+str.substring(leng-1));
    }
}