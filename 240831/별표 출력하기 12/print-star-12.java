import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //짝, 홀에 따른 별 구성 체크
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || (j%2 == 1 && j>=i)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}