import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str, reverse ; 

        while(true){
            str = sc.next();
            reverse = "";
            
            if(str.equals("END")) break;

            for(int i=str.length()-1; i>-1; i--){
                reverse += str.substring(i,i+1);
            }

            System.out.println(reverse);
        }//while


    }
}