import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();
        int i = 0;

        if(c.equals("A")){
            while(i++ < n){
                System.out.print(i+" ");
            }
        }else{
            while(i++ < n){
                System.out.print(n-i+" ");
            }
        }

    }
}