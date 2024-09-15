import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i=str.length()-1; i>-1; i--){
            if(i%2 == 1) result += str.charAt(i);
        }

        System.out.print(result);

    }
}