import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //동서남북 EWSN
        int [] dirX = {1, -1 , 0, 0};
        int [] dirY = {0, 0, -1, 1};
        char point;
        int dis=0, x=0, y=0,ewsn=0;

        for(int i=0; i<n; i++){
            point = sc.next().charAt(0);
            dis = sc.nextInt();
            ewsn = 0;

            if(point == 'E'){ewsn = 0;}
            if(point == 'W'){ewsn = 1;}
            if(point == 'S'){ewsn = 2;}
            if(point == 'N'){ewsn = 3;}

            x += dirX[ewsn]*dis;
            y += dirY[ewsn]*dis;
        }

        System.out.print(x+" "+y);
    }
}