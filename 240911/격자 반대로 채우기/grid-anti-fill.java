import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;
        boolean bottom_up = false;

        for(int j=n-1; j>=0; j--){
            for(int i=0; i<n; i++){
                //아래에서 위로 올라오는 경우
                if((n-1)%2 == j%2){
                    arr[n-i-1][j] = cnt++;
                //위에서 아래로 내려가는 경우
                }else{
                    arr[i][j] = cnt++;
                }
            }
        }

        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}