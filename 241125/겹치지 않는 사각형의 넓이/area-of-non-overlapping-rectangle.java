import java.util.*;

public class Main {
    public static final int offset = 1000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2;
        int cnt = 0;
        boolean[][] flag = new boolean[2001][2001];

        while(cnt < 3){
            cnt++; //a,b,m
                x1 = sc.nextInt()+offset;
                y1 = sc.nextInt()+offset;
                x2 = sc.nextInt()+offset;
                y2 = sc.nextInt()+offset;

                if(cnt != 2){
                    for(int x=x1; x<x2; x++){
                        for(int y=y1; y<y2; y++){
                            flag[x][y] = true;
                        }
                    }
                }else{
                    for(int x=x1; x<x2; x++){
                        for(int y=y1; y<y2; y++){
                            flag[x][y] = false;
                        }
                    }
                }
        }//while

    int result = 0;
    for(int x=0; x<2000; x++){
        for(int y=0; y<2000; y++){
            if(flag[x][y] == true) result++;
        }
    }

    System.out.print(result);


    }
}