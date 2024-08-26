import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String item;

        if(n>=3000){ item = "book";}
        else if(n >= 1000) {item = "mask";}
        else{item = "no";}

        System.out.println(item);
    }
}