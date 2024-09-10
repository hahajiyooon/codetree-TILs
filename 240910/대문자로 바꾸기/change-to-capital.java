import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=15; i++){
            System.out.print((char)(sc.next().charAt(0)-32)+" ");
            if(i%3 == 0)System.out.print("\n");
        }
    }
}