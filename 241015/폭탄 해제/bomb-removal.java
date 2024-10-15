import java.util.*;
class Bomb{
    String code;
    String color;
    int time;

    public Bomb(String code, String color, int time){
        this.code = code;
        this.color = color;
        this.time = time;

    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String rgb = sc.next();
        int second = sc.nextInt();

        Bomb input = new Bomb(c,rgb,second);

        System.out.println("code : "+input.code);
        System.out.println("color : "+input.color);
        System.out.println("second : "+input.time);
    }
}