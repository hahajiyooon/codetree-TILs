import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] c = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char input = sc.next().charAt(0);
        int idx = -1;

        for(int i=0; i<c.length; i++){
            if(input == c[i]){
                idx = i;
            }
        }

        System.out.print((idx != -1)? idx : "None");
        
    }
}