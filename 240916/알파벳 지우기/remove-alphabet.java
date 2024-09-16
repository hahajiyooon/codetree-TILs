import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String s1 = "";
        String s2 = "";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9'){
                s1 += str1.charAt(i);
            }
        }

        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) >= '0' && str2.charAt(i) <= '9'){
                s2 += str2.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(s1)+Integer.parseInt(s2));


    }
}