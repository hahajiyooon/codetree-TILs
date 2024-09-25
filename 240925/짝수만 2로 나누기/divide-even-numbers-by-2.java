import java.util.*;

public class Main {
    public static void divide2(int[] arr){

        for(int i=0; i<arr.length; i++){
            arr[i] = (arr[i]%2 == 0)? arr[i]/2 : arr[i];  
        }

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();  
        }

        divide2(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}