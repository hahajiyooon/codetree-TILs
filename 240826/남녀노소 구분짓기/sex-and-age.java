import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex==0){//남자
            System.out.println((age>18)? "MAN" : "BOY");
        }else{
            System.out.println((age>18)? "WOMAN" : "GIRL");
        }
    }
}