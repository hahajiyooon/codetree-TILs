import java.util.*;
public class Main {
    public static void print(int n){
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(num == 10) num = 1;
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);

    }
}