import java.util.*;

public class Main {
    public static boolean sequenceflag(int[]a, int[]b){
        //System.out.print("함수호출");
        boolean flag = false;
        int idx = 0;

        //b길이가 a길이보다 길 경우 > 연속부분수열아님
        if(a.length < b.length) return false;

        //a길이가 더 길 경우
        while(true){
            //a배열에 b[0]가 없는경우
            if(idx >= a.length) return false;

            if(a[idx] == b[0]) {
                for(int i=0; i<b.length; i++){
                    flag = true;

                    if(a[idx+i] != b[i]){
                        flag = false; break;
                    }
                }//for

                if(flag) return true;
            }
            
            idx++;
        }//while
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for(int i=0; i<n1; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            b[i] = sc.nextInt();
        }

        System.out.print((sequenceflag(a,b))? "Yes" : "No");
    }
}