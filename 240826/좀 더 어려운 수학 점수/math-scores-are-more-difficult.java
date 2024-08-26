import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int aMAth = sc.nextInt();
        int aEng = sc.nextInt();
        int bMAth = sc.nextInt();
        int bEng = sc.nextInt();
        String name ;

        if(aMAth == bMAth){
            name = ((aEng > bEng)? "A" : "B");
        }else{
            name = ((aMAth > bMAth)? "A" : "B");
        }

        System.out.println(name);

    }
}