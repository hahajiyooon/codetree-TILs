import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char result = (c == 'a')? 'z' : (char)(c-1);

        System.out.print(result);
    }
}