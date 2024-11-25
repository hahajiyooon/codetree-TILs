import java.util.*;

public class Main {
    public static final int offset = 100;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        boolean flag = false;
        boolean[][] square = new boolean[201][201];

        for(int i=0; i<n; i++){
            x1 = sc.nextInt()+offset;
            y1 = sc.nextInt()+offset;
            x2 = sc.nextInt()+offset;
            y2 = sc.nextInt()+offset;

            if(i%2 == 0){
                for(int x=x1; x<x2; x++){
                    for(int y=y1; y<y2; y++){
                        square[x][y] = false;
                    }
                }
            }else{
                for(int x=x1; x<x2; x++){
                    for(int y=y1; y<y2; y++){
                        square[x][y] = true;
                    }
                }
            }
        }//while

        int cnt = 0;
        for(int x=x1; x<201; x++){
            for(int y=y1; y<201; y++){
                if(square[x][y]) cnt++;
            }
        }
        
        System.out.print(cnt);

    }
}