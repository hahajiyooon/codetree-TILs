import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //0시0분~a시b분까지 총 분 = x
        //0시0분~c시d분까지 총 분 = y
        //y-x = 구하고자하는 답
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 0;
        int y = 0;

        x = a*60+b;
        y = c*60+d;

        System.out.print(y-x);

    }
}