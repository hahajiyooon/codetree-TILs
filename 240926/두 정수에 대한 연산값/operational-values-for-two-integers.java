import java.util.*;

public class Main {
    public static int calculA(int max){
        return max+25;
    }
    public static int calculB(int min){
        return min*2;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a>b)? a : b;
        int min = (a<b)? a : b;

        if(max==a){
            System.out.print(calculA(max)+" "+calculB(min));
        }else{
            System.out.print(calculB(min)+" "+calculA(max));
        }

    }
}