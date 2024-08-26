import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.println((b%2==1 && b%3==0) ||(b%2==0 && b%5==0)? "true" : "false");
    }
}