import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = false;

        while(a <= b){
            if(a++%c == 0) {
                flag = true;
                break;
            }
        }

        System.out.print((flag)? "YES" : "NO");
    }
}