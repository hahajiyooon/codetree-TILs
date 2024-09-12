import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int min = 20;
        int max = 0;
        int n = 0;

        for(int i=0; i<3; i++){
            n = sc.next().length();
            if(n > max) max = n;
            if(n < min) min = n;
        }

        System.out.print(max-min);
    }
}