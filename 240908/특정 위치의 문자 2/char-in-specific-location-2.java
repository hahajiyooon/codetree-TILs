import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n ;
        String result = "";

        for(int i=0; i<10; i++){
            n = sc.next();
            if(i==1 || i==4 || i==7){
                result += n+" ";
            }
        }

        System.out.print(result);

    }
}