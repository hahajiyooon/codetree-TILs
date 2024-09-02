import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n;
        int[] arr = new int[total];

        for(int i=0; i<total; i++){
            n = sc.nextInt();
            arr[i] = n;
        }

        for(int i=total-1; i>-1; i--){
            if(arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}