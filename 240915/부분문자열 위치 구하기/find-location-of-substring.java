import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();
        int idx = -1; // 문자열 존재하지 않을때를 디폴트로

        for(int i=0; i<input.length(); i++){
            if(input.contains(target)){
                idx = input.indexOf(target);
                break;
            }
        }

        System.out.print(idx);
    }
}