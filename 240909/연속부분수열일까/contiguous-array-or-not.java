import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];
        int idx = -1 ;
        int cnt = 0;

        //행렬에 입력된 값 넣어주기
        for(int i=0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            arrB[i] = sc.nextInt();
        }

        //arrB[0]과 일치하는 arrA의 인덱스값 구하기
        //연속 부분 수열인지 체크
        for(int i=0; i<n1; i++){
            if(arrB[0] == arrA[i]) {
                idx = i;
                cnt = 0;

                for(int j=idx; j<=n2; j++){
                    if(arrB[j-idx] != arrA[j])  {
                        break;
                    }else{
                        cnt++;
                    }
                }//for

                if(cnt == n2){
                    break;
                }
            }//if
        }//for

        System.out.print( cnt == n2? "Yes" : "No");

    }
}