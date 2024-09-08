import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;

        while(true){
            n = sc.nextInt();

            if(n == 0) break;
            arr[n/10]++;
        }

        for(int i=1; i<10; i++){
            System.out.println(i+" - "+arr[i]);
        }

    }
}