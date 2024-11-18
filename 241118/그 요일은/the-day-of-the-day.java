import java.util.*;

public class Main {
    public static int dayCnt(int m1, int d1, int m2, int d2, String a){
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] monthCnt = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int totalCnt = 0;
        int result = 0;

        totalCnt = d2-d1;
        for(int i=m1; i<m2; i++){
            totalCnt += monthCnt[i];
        }

        for(int i=1; i<=totalCnt; i++){
            if(a.equals(day[i%7])){
                result ++;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String a = sc.next();

        System.out.print(dayCnt(m1,d1,m2,d2,a));
    }
}