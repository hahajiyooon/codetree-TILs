import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 0;
        int cnt = 0;
        int e = 0;

        arr[0] = sc.nextInt();
        min = arr[0];

        //min값 구하기
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }

        //min값의 원소의 개수 구하기
        for(int i : arr){
            if(min == i) cnt++;
        }

        System.out.print(min+" "+cnt);

    }
}