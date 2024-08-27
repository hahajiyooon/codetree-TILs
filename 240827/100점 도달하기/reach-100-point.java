import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = "";

        while(score <= 100){
            if(score/10 < 6){grade = "F";}
            if(score/10 == 6){grade = "D";}
            if(score/10 == 7){grade = "C";}
            if(score/10 == 8){grade = "B";}
            if(score/10 >= 9){grade = "A";}

            System.out.print(grade+" ");
            score++;
        }
    }
}