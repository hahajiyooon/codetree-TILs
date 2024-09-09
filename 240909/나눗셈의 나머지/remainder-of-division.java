import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quotient = 0; //몫
        int remainder = 0; //나머지
        int[] cnt = new int[10];
        int sum = 0;

        while(a != 0){
            quotient = a/b;
            remainder = a%b;
            a = quotient;

            cnt[remainder]++;
        }

        for(int i : cnt){
            sum += i*i;
        }

        System.out.print(sum);
    }
}