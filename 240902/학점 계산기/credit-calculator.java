import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double avg = 0;
        String str = "";
        

        for(int i=0; i<n; i++){
            sum  += sc.nextDouble();
        }

        avg = sum/n;
        System.out.printf("%.1f",avg);

        if(avg >= 4){
            str = "Perfect";
        }else if(avg >= 3){
            str = "Good";
        }else{
            str = "Poor";
        }

        System.out.print("\n"+str);
    }
}