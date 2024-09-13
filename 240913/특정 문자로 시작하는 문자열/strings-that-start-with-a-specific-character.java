import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        char check ;
        int leng = 0;
        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            input[i] = sc.next();
        }

        check = sc.next().charAt(0);

        for(int i=0; i<n; i++){
            leng = input[i].length();
            
            for(int j=0; j<leng; j++){
                if(input[i].charAt(j) == check) {
                    cnt++;
                    sum += leng;
                }
            }
        }

        System.out.printf("%d %.2f",cnt,(double)sum/cnt);

    }
}