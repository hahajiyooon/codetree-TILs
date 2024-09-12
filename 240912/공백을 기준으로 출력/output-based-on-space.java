import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for(int i=0; i<str1.length(); i++){
            System.out.print(str1.charAt(i)==' '? "" : str1.charAt(i));
        }

        for(int j=0; j<str2.length(); j++){
            System.out.print(str2.charAt(j)==' '? "" : str2.charAt(j));
        }
    }
}