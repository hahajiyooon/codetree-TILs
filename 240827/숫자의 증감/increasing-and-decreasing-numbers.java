import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();
        int i = 0;

        while(i++ < n){
                System.out.print(c.equals("A")? i+" " : n-i+" ");            
        }

    }
}