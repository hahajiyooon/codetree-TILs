import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = 0;
       // char[] arr = str.toCharArray();

        while(str.length() > 1){
            idx = sc.nextInt();

            if(idx >= str.length()){
                str = str.substring(0,str.length()-1);
            }else{
                str = str.substring(0,idx)+str.substring(idx+1);
            }

            System.out.println(str);
        }

    }
}