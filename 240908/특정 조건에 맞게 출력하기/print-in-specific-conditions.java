import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while ((n = sc.nextInt()) != 0){
            System.out.print((n%2==0)? n/2 : n+3 );
            System.out.print(" ");
        }
    }
}