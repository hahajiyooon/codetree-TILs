import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] list = {"John", "Tom", "Paul"};

        System.out.println((n>3)? "Vacancy" : list[n-1]);


    }
}