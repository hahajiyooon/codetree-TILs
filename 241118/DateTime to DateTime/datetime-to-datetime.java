import java.util.*;

public class Main {
    public static int timeCnt(int a, int b, int c){

        if(a == 11 && b < 11) return -1;
        if(a == 11 && b == 11 && c < 11) return -1;

        return (a-11)*24*60 + (b-11)*60 + (c-11);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(timeCnt(a,b,c));

    }
}