import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();        

        System.out.print((int)(a+b)+" ");
        System.out.printf("%.1f",(a+b)/2);
    }
}