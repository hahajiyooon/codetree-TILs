import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] dayCnt = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;

        total = d2-d1+1;
        for(int i=m1-1; i<m2-1; i++){
            total += dayCnt[i];
        }
        
        System.out.print(total);
        
    }
}