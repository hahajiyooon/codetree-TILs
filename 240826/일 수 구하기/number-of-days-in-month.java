import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println(day[n-1]);

    }
}