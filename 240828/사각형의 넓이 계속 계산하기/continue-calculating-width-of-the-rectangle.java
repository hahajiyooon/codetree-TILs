import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x, y;
        String letter;

        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            letter = sc.next();

            System.out.println(x*y);  

            if(letter.equals("C")) break;
        } 
    }
}