import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int n = 0;

        for(int i=0; i<9; i++){
            n = sc.nextInt();
            if(max < n){
                max = n;
            }
        }

        System.out.print(max);

    }
}