import java.util.*;

public class Main {
    public static final int offset = 500000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 0;
        char d;

        //a로봇
        int [] aRobot = new int[1000000];
        int aIdx = 1;
        for(int i=0; i<n; i++){
            t = sc.nextInt();
            d = sc.next().charAt(0);

            while(t-- > 0){
                if(d == 'L'){
                    aRobot[aIdx] = aRobot[aIdx-1]-1; 
                }else if(d == 'R'){
                    aRobot[aIdx] = aRobot[aIdx-1]+1; 
                }
                aIdx++;
            }
        }//for

        //b로봇
        int [] bRobot = new int[1000000];
        int bIdx = 1;
        for(int i=0; i<m; i++){
            t = sc.nextInt();
            d = sc.next().charAt(0);

            while(t-- > 0){
                if(d == 'L'){
                    bRobot[bIdx] = bRobot[bIdx-1]-1; 
                }else if(d == 'R'){
                    bRobot[bIdx] = bRobot[bIdx-1]+1; 
                }
                bIdx++;
            }
        }//for

        int idxMax = 0;
        if(aIdx < bIdx){
            for(int i=aIdx; i<bIdx; i++){
                aRobot[i] = aRobot[i-1];
                idxMax = bIdx;
            }
        }else{
            for(int i=bIdx; i<aIdx; i++){
                bRobot[i] = bRobot[i-1];
                idxMax = aIdx;
            }
        }

        int cnt = 0;
        for(int i=1; i<idxMax; i++){
            if(aRobot[i] == bRobot[i] && aRobot[i-1] != bRobot[i-1]){
                cnt++;
            }
        }

        System.out.print(cnt);
    }        
}