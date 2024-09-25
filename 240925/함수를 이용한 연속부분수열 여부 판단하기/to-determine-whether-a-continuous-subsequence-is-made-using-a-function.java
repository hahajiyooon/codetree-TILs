import java.util.*;

public class Main {
    public static boolean sequenceflag(int[]a, int[]b){
        //System.out.print("함수호출");
        int first = 0;
        int idx = 0;

        while(true){
            //a배열에 b[0]가 없는경우
            if(idx >= a.length) return false;

            if(a[idx] == b[0]) {
                first = idx;
                for(int i=0; i<b.length; i++){
                    if(a[idx+i] != b[i]){
                        return false;
                    }
                }//for
                return true;
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