import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        String result;

        if(r>=1 && l>=1){
            result = "High";
        }else if(r>=0.5 && l>=0.5){
            result = "Middle";
        }else{
            result = "Low";
        }

        System.out.println(result);

    }
}