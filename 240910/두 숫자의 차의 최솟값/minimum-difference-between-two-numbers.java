import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int gap = 100;

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            if(gap > arr[i+1]-arr[i]){
                gap = arr[i+1]-arr[i];
            }
        }

        System.out.print(gap);
    }
}