import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e ; 
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            e = sc.nextInt();
            if(e%2 == 0){
                arr[i] = e;
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}