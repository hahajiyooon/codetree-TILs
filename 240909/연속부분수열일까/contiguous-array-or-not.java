import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];
        int idx = 0 ;
        boolean flag = true;

        //행렬에 입력된 값 넣어주기
        for(int i=0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            arrB[i] = sc.nextInt();
        }

        //arrB[0]과 일치하는 arrA의 인덱스값 구하기
        for(int i=0; i<n1; i++){
            if(arrB[0] == arrA[i]) idx = i;
        }

        //연속 부분 수열인지 체크
        for(int i=idx; i<=n2; i++){
            if(arrB[i-idx] != arrA[i])  flag = false;
        }

        System.out.print(flag? "Yes" : "No");

    }
}