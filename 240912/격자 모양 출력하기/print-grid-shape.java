import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = 0;
        int c = 0;
        int[][] arr = new int[n][n];

        for(int i=0; i<m; i++){
            r = sc.nextInt();
            c = sc.nextInt();
            arr[r-1][c-1] = r*c;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}