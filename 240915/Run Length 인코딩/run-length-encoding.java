import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next()+"A"; // 문자열의 마지막이 if문에 걸리기 위한 조건 추가("A")
        int leng = str.length();
        String result = "";
        int cnt = 1 ;

        for(int i=1; i<leng; i++){
            if(str.charAt(i) != str.charAt(i-1)){
                result += str.charAt(i-1);
                result += cnt;
                cnt = 1;
            }else{
                cnt++;
            }
        }//for

        System.out.println(result.length());
        System.out.println(result);
    }
}