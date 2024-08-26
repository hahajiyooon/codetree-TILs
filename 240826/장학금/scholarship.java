import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int fin = sc.nextInt();
        int money = 0;

        if(mid >= 90){
            if(fin >= 95){
                money = 100000;
            }else if(fin >= 90){
                money = 50000;
            }
        }

        System.out.println(money);
    }
}