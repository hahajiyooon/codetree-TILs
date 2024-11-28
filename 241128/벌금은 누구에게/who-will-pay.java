import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int num;
        int result = -1;
        int[] student = new int[101];

        for(int i=0; i<m; i++){
            num = sc.nextInt();
            student[num]++;

            if(student[num] == k){
                result = num;
                break;
            }
        }//for

        System.out.print(result);

    }
}