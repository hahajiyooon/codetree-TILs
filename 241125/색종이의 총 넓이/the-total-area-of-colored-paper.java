import java.util.*;

public class Main {
    public static final int offset = 100; //좌표 보정상수
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int x = 0;
        int y = 0; //좌측하단 점
        int cnt = 0;
        boolean [][] coloredPapaer = new boolean[201][201];

        for(int i=0; i<n; i++){
            x = sc.nextInt()+offset;
            y = sc.nextInt()+offset;

            for(int a=x; a<x+8; a++){
                for(int b=y; b<y+8; b++){
                    coloredPapaer[a][b] = true;
                }
            }
        }//for

        for(int i=0; i<201; i++){
            for(int j=0; j<201; j++){
                if(coloredPapaer[i][j]) cnt++;
            }
        }
        
        System.out.print(cnt);

    }
}