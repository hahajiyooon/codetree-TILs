import java.util.*;

public class Main {
    public static String findDay(int m1, int d1, int m2, int d2){
        int[] monthCnt ={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int totalCnt = 0;
        
        totalCnt = d2-d1;
        if(m1 <= m2){
            for(int i=m1; i<m2; i++){
                totalCnt += monthCnt[i];
            }
        }else{
            for(int i=m2; i<m1; i++){
                totalCnt -= monthCnt[i];
            }
        }

        for(int i=0; i<7; i++){
            if((totalCnt-i)%7 == 0){
                return day[i];
            }
        }

        return "-1";
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.print(findDay(m1,d1,m2,d2));

    }
}