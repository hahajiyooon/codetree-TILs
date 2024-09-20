import java.util.*;

public class Main {
    public static boolean leapYear(int y){
        if(y%4 == 0){
            if(y%100 == 0 && y%400 != 0){
                return false;
            }
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.print(leapYear(y)?"true" : "false");
    }
}