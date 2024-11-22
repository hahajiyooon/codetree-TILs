import java.util.*;

public class Main {
    public static final int offset = 100;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1,y1,x2,y2;
        boolean [][] stack = new boolean[201][201];

        for(int i=0; i<n; i++){
            x1 = sc.nextInt()+offset;
            y1 = sc.nextInt()+offset;
            x2 = sc.nextInt()+offset;
            y2 = sc.nextInt()+offset;

            for(int x=x1; x<x2; x++){
                for(int y=y1; y<y2; y++){
                    if(stack[x][y] == false) stack[x][y] = true;
                }
            }
        }//for

        int cnt = 0;
        for(int x=0; x<200; x++){
            for(int y=0; y<200; y++){
                if(stack[x][y] == true) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);

    }
}