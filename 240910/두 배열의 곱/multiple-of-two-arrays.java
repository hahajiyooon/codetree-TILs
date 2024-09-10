import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int[] b = new int[9];

        for(int i=0; i<9; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<9; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i<9; i++){
            System.out.print(a[i]*b[i]+" ");
            if(i%3==2) {
                System.out.println();
            }
        }
    }
}