import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = 0;

        for(int i=0; i<n; i++){
            e = sc.nextInt();
            System.out.print(e*e+" ");
        }
    }
}