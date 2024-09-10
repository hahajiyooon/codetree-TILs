import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int min, max;
        int idx = 0;
        int[] arr = new int [n];

        arr[0] = sc.nextInt();
        min = arr[0];
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();
            
            if(arr[i] < min && i != n-1){
                min = arr[i];
                idx = i; 
            }
        }

        max = min;
        for(int i=idx; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print((max == min)? 0 : max-min );


    }
}