import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int big = 1;
        int small = 1000;
        int n;
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(arr[i] < 500 && arr[i] > big){
                big = arr[i];
            }
            if(arr[i] > 500 && arr[i] < small){
                small = arr[i];
            }
        }

        System.out.printf("%d %d",big,small);
    }
}