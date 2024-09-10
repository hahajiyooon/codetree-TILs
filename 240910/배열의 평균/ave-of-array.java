import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[2][4];
        int avgR = 0;
        int avgC = 0;
        double sum = 0;

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            avgR = 0;
            for(int j=0; j<4; j++){
                avgR += arr[i][j];

            }
            sum += (double)avgR/4;
            System.out.print((double)avgR/4+" ");
        }
        System.out.println();

        for(int j=0; j<4; j++){
            avgC = 0;

            for(int i=0; i<2; i++){
                avgC += arr[i][j];
            }
            sum += (double)avgC/2;
            System.out.print((double)avgC/2+" ");
        }

        System.out.println();
        System.out.printf("%s",sum/6);

    }
}