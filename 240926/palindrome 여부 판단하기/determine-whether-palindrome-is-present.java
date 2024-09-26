import java.util.*;

public class Main {
    public static boolean palindrome(String s){
        int leng = s.length();

        for(int i=0; i<leng/2; i++){
            if(s.charAt(i)!=s.charAt(leng-i-1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(palindrome(str)? "Yes" : "No");
    }
}