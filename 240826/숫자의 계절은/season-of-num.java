import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        String result ;

        if(season/3 == 4){
            result = "Winter";
        }else if(season/3 == 3){
            result = "Fall";
        }else if(season/3 == 2){
            result = "Summer";
        }else if(season/3 == 1){
            result = "Spring";
        }else{
            result = "Winter";
        }

        System.out.println(result);
        
    }
}