import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        String[] name = {"John","Tom","Paul","Sam"};

        while((n = sc.nextInt()) != 0){
            if(n > 4){
                System.out.println("Vacancy");
                break;
            }

            System.out.println(name[n-1]);

        }
    }
}