import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            ch[i] = str.charAt(i);
        }

        ch[1] = 'a';
        ch[str.length()-2] = 'a';

        str = String.valueOf(ch);

        System.out.print(str);

    }
}