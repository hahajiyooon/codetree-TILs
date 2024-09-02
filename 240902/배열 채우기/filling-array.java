import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;
        int idx = 0;

        while((n = sc.nextInt()) != 0){
            arr[idx++] = n;
        }
        
        for(int i=9; i>-1; i--){
            if(arr[i] != 0) System.out.print(arr[i]+" ");
        }

    }
}