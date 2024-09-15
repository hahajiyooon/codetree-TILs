import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int lengA = a.length();
        int lengB = b.length();
        int i = 0;

        while(a.contains(b)){
           
            if(a.substring(i,i+lengB).equals(b)){
                a = a.substring(0,i)+a.substring(i+lengB);
                i = 0;
            }else{
                i++;
            }
        }

        System.out.print(a);


    }
}