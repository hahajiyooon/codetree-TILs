import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[100000];
        int idx = 0;

        while(true){
            if(n < 2) {
                binary[idx++] = n%2;
                break;
            }
            
            binary[idx++] = n%2;
            n /= 2;
        }

        for(int i=idx-1; i>=0; i--){
            System.out.print(binary[i]);
        }
    }
}