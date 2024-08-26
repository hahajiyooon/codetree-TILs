import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String cold1 =  sc.next();
        int temp1 = sc.nextInt();
        String cold2 = sc.next();
        int temp2 = sc.nextInt();
        String cold3 = sc.next();
        int temp3 = sc.nextInt();
        int cnt = 0;

        if(cold1.equals("Y") && temp1 >= 37){ cnt++;}
        if(cold2.equals("Y") && temp2 >= 37){ cnt++;}
        if(cold3.equals("Y") && temp3 >= 37){ cnt++;}

        System.out.println(cnt >= 2 ? "E" : "N");

    }
}